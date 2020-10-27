package br.com.arthur.principles.designpatterns.chainofresponsibility.solucao;

public interface Desconto {
    double desconta(Orcamento orcamento);

    void setProximo(Desconto proximo);
}
