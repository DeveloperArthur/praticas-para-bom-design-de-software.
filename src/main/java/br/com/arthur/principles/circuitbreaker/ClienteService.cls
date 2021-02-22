private void enviaParaIntegrar(){
	List<ClienteDto> clientes = repository.buscaClientesParaIntegrar();
	for(ClienteDto cliente : clientes){
		HttpRequest requisicao = new HttpRequest('111.222.3.444:5555');
		requisicao.setBody(cliente);
		requisicao.setMethod('POST')
		envia(requisicao);
	}	
}
