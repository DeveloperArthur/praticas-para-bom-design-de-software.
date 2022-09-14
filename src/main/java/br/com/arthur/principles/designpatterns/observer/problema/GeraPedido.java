package br.com.arthur.principles.designpatterns.observer.problema;

public class GeraPedido {
    
    public void gera() {
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(orcamento);

        //Veja que sempre que geramos um pedido, precisamos instanciar varias classes
        //isso é um problema pois essa classe sempre vai tender a crescer
        //Se voce tem varias acoes pra executar, quando um determinado evento acontece, use Observer
        new PedidoDao().executa(pedido);
        new EnviaEmail().executa(pedido);
        new EnviaParaERP().executa(pedido);
        new EnviaPorSMS().executa(pedido);
    }
}
