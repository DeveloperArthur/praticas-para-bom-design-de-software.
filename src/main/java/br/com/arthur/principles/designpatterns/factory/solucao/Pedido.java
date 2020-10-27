package br.com.arthur.principles.designpatterns.factory.solucao;

public class Pedido {
    private String nome;
    private StatusDoPedido statusDoPedido;

    public StatusDoPedido getStatusDoPedido() {
        return statusDoPedido;
    }

    public String getNome() {
        return nome;
    }
}
