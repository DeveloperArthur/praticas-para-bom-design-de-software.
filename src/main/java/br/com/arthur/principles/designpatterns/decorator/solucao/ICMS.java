package br.com.arthur.principles.designpatterns.decorator.solucao;

public class ICMS extends Imposto {

    public ICMS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICMS() {
    }

    @Override
    public double calcula() {
        return 5 + 5 + calculoDoOutroImposto();
    }
}
