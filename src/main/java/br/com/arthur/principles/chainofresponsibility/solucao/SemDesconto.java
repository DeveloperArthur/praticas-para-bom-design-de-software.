package br.com.arthur.principles.designpatterns.chainofresponsibility.solucao;

public class SemDesconto implements Desconto{

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {}
}
