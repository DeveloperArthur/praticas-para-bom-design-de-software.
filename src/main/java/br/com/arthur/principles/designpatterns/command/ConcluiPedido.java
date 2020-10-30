package br.com.arthur.principles.designpatterns.command;

public class ConcluiPedido implements Comando {
    private Pedido pedido;

    public ConcluiPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public void executa() {
        this.pedido.finaliza();
    }
}
