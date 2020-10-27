package br.com.arthur.principles.designpatterns.mediator.solucao;

public interface Mediator {
    void envia(String m, Colleague c);

    void adicionarColleague(Colleague colleague);
}
