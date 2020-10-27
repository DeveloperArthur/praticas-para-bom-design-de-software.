package br.com.arthur.principles.designpatterns.factory.solucao;

public class Email {
    private String mensagem;

    public void envia(String cpf, String nome, String endereco, Pedido pedido) {
        if (pedido.getStatusDoPedido().equals(StatusDoPedido.ALTERADO)) {
            mensagem = EmailFactory.montaMensagemDeEmailParaPedidoAlterado(cpf, nome, endereco, pedido);
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.CANCELADO)) {
            mensagem = EmailFactory.montaMensagemDeEmailParaPedidoCancelado(cpf, nome, endereco, pedido);
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.EM_ANDAMENTO)) {
            mensagem = EmailFactory.montaMensagemDeEmailParaPedidoEmAndamento(cpf, nome, endereco, pedido);
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.EM_ESPERA)) {
            mensagem = EmailFactory.montaMensagemDeEmailParaPedidoEmEspera(cpf, nome, endereco, pedido);
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.ENTREGUE)) {
            mensagem = EmailFactory.montaMensagemDeEmailParaPedidoEntregue(cpf, nome, endereco, pedido);
        }
    }
}
