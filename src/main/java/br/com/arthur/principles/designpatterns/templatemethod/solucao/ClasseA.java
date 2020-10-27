package br.com.arthur.principles.designpatterns.templatemethod.solucao;

public class ClasseA extends ClasseAbstrata {
    private double valor;

    @Override
    public double logicaDeCalculo() {
        return 3 * 4;
    }

    @Override
    public boolean logicaCondicional() {
        return this.valor > 2;
    }
}
