package br.com.arthur.principles.designpatterns.templatemethod.solucao;

public class ClasseB extends ClasseAbstrata {
    private double valor;

    @Override
    public double logicaDeCalculo() {
        return 7 + 8;
    }

    @Override
    public boolean logicaCondicional() {
        return this.valor > 4;
    }
}
