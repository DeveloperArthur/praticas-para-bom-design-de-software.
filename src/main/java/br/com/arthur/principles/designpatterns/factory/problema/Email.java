/*
* Repare que classe dificil de manter, ao inves disso podemos usar factory
* vamos isolar a criacao do objeto em uma classe que faz apenas isso!
* */

package br.com.arthur.principles.designpatterns.factory.problema;

public class Email {
    private String mensagem;

    public void envia(String cpf, String nome, String endereco, Pedido pedido) {
        if (pedido.getStatusDoPedido().equals(StatusDoPedido.ALTERADO)) {
            mensagem = "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                    "do endereco: " + endereco + " esta alterado conforme foi solicitado!";
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.CANCELADO)) {
            mensagem = "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                    "do endereco: " + endereco + " esta cancelado por fins de nao arrumar problema qualquer" +
                    " coisa blabalbala";
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.EM_ANDAMENTO)) {
            mensagem = "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                    "do endereco: " + endereco + " esta em andamento, chegaremos em breve!";
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.EM_ESPERA)) {
            mensagem = "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                    "do endereco: " + endereco + " seu pedido esta em espera beleza?!!!!";
        } else if (pedido.getStatusDoPedido().equals(StatusDoPedido.ENTREGUE)) {
            mensagem = "Senhor(a) " + nome + ", do CPF: " + cpf + " o pedido " + pedido.getNome() + " " +
                    "do endereco: " + endereco + " foi entregue uhuuuuuuuuuuuuu";
        }
    }
}
