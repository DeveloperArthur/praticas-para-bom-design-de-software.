package br.com.arthur.principles.designpatterns.templatemethod.solucao;

public abstract class ClasseAbstrata {

    public double calculo() {
        if (logicaCondicional()) {
            return logicaDeCalculo();
        }
        return 0;
    }

    public abstract double logicaDeCalculo();

    public abstract boolean logicaCondicional();
}
