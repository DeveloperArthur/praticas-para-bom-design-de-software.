public class CircuitBreaker {
    private Integer tentativasDeIntegrar = 0;
    private Integer limiteDeTentativas = 10;
    private Integer codigoHttpDeErro {get;set;}
    
    public Boolean excedeuLimiteDeTentativas(){
        return this.tentativasDeIntegrar >= this.limiteDeTentativas;
    }
        
    public void aumentaContadorDeTentativas(){
        this.tentativasDeIntegrar++;
    }
    
    public void setCodigoHttpDeErro(Integer codigoHttp){
        this.codigoHttpDeErro = codigoHttp;
    }
    
    public HttpResponse getRetornoAlternativo(){
        HttpResponse retornoAlternativo = new HttpResponse();
        retornoAlternativo.setStatusCode(this.codigoHttpDeErro);
        retornoAlternativo.setStatus('Web Service fora do ar');
        return retornoAlternativo;
    }
}
