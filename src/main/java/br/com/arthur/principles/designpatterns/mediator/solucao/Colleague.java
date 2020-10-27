package br.com.arthur.principles.designpatterns.mediator.solucao;

public class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enviaMensagem(String mensagem) {
        mediator.envia(mensagem, this);
    }
}
