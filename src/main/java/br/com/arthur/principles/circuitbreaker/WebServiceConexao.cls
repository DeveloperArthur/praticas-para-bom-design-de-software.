
/*
Quando seu sistema vai fazer várias chamadas em um sistema 
externo que talvez esteja fora do ar, imagine que se 
tivermos 100 clientes para integrar e o sistema externo 
tiver fora do ar, vamos fazer 100 requisicoes ATOA, 
isso consome tempo e processamento sem necessidade... 
nesse caso podemos usar o circuit breaker, com ele vc 
estabelece um limite de tentativas para integrar caso 
o sistema externo esteja fora, depois de X tentativas
de integrar com falha, ele nem envia mais a requisicao
apenas retorna o erro direto... É o que chamamos de
retorno alternativo.
*/
public class WebServiceConexao {
	
	private HttpResponse envia(HttpRequest requisicao){
		CircuitBreaker circuitBreaker = new CircuitBreaker();
        
		if(circuitBreaker.excedeuLimiteDeTentativas())
			return circuitBreaker.getRetornoAlternativo();
        
		HttpResponse resposta = new Http().send(requisicao);
		Boolean requisicaoDeuFalha = resposta.getStatusCode() >= 400;
            
		if(requisicaoDeuFalha){
			circuitBreaker.aumentaContadorDeTentativas();
			circuitBreaker.setCodigoHttpDeErro(resposta.getStatusCode());
			return circuitBreaker.getRetornoAlternativo();
		}

        	System.debug('Conta enviada ao Webservice ');
        	return resposta;
	}
}
