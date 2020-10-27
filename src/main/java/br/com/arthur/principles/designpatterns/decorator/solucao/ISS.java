package br.com.arthur.principles.designpatterns.decorator.solucao;

public class ISS extends Imposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }

    public ISS() {
    }

    @Override
    public double calcula() {
        return 7 + 8 + calculoDoOutroImposto();
    }
}
