package br.com.arthur.principles.designpatterns.factory.solucao;

public class EmailFactory {
    public static String montaMensagemDeEmailParaPedidoAlterado(String cpf, String nome, String endereco, Pedido pedido) {
        return "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                "do endereco: " + endereco + " esta alterado conforme foi solicitado!";
    }

    public static String montaMensagemDeEmailParaPedidoCancelado(String cpf, String nome, String endereco, Pedido pedido) {
        return "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                "do endereco: " + endereco + " esta cancelado por fins de nao arrumar problema qualquer" +
                " coisa blabalbala";
    }

    public static String montaMensagemDeEmailParaPedidoEmAndamento(String cpf, String nome, String endereco, Pedido pedido) {
        return "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                "do endereco: " + endereco + " esta em andamento, chegaremos em breve!";
    }

    public static String montaMensagemDeEmailParaPedidoEmEspera(String cpf, String nome, String endereco, Pedido pedido) {
        return "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                "do endereco: " + endereco + " seu pedido esta em espera beleza?!!!!";
    }

    public static String montaMensagemDeEmailParaPedidoEntregue(String cpf, String nome, String endereco, Pedido pedido) {
        return "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                "do endereco: " + endereco + " foi entregue uhuuuuuuuuuuuuu";
    }
}
