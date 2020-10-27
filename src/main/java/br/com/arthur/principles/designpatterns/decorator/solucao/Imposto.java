package br.com.arthur.principles.designpatterns.decorator.solucao;

public abstract class Imposto {
    protected Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    public Imposto() {
    }

    public abstract double calcula();

    protected double calculoDoOutroImposto() {
        if (outroImposto == null)
            return 0;
        return outroImposto.calcula();
    }
}
