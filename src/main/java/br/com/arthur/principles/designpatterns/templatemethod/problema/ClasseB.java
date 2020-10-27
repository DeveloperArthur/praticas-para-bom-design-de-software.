package br.com.arthur.principles.designpatterns.templatemethod.problema;

public class ClasseB {
    private double valor;

    public double calculo() {
        if (this.valor > 4) {
            return 7 + 8;
        }
        return 0;
    }
}
