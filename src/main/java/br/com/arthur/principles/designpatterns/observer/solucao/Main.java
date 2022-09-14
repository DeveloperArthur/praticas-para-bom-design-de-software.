package br.com.arthur.principles.designpatterns.observer.solucao;

public class Main {
    
    public static void main(String[] args) {
        GeraPedido geraPedido = new GeraPedido(Arrays.asList(
            new EnviaEmail(), new EnviaParaERP(), 
            new EnviaPorSMS(), new PedidoDao()
        ));
        geraPedido.gera();
    }
}
