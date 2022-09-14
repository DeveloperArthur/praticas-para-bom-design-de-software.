package br.com.arthur.principles.designpatterns.observer.solucao;

public class GeraPedido {
    
    List<AcoesAposGerarPedido> acoes;

    public GeraPedido(List<AcoesAposGerarPedido> acoes){
        this.acoes = acoes;
    }

    public void gera() {
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(orcamento);

        //Como todos os metodos tinham o nome igual executa e recebiam o mesmo parametro pedido
        //Criei uma interface, onde todos implementam
        //e recebo no construtor uma lista dessa interface
        //depois de gerar o pedido, efetuo o disparo
        acoes.forEach(acao -> {
            acao.executa(pedido);
        })

        //Se surgir uma nova ação para executar, por exemplo nota fiscal
        //nao sera necessario mexer nesse codigo, apenas criar uma classe
        //implementando a interface e adicionar na lista da classe main

        //Entao aqui nos temos ouvintes, observadores, classes que estao observando o evento
        //e a classe que dispara os eventos para os interessados

        //Esse é um exemplo de inversao de dependencia, ao inves de chamarmos classe por classe
        //a gente dispara o evento e cada uma das classes vao ser notificadas, e elas que vao reagir ao evento
    }
}
