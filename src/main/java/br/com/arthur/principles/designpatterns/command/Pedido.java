package br.com.arthur.principles.designpatterns.command;

public class Pedido {
    private String cliente;
    private double valor;
    private Status status;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = Status.NOVO;
    }

    public void paga(){
        this.status = Status.PAGO;
    }

    public void finaliza(){
        this.status = Status.ENTREGUE;

    }
}
