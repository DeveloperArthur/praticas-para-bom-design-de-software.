package br.com.arthur.principles.designpatterns.decorator.solucao;

public class ICPP extends Imposto {

    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }

    public ICPP() {
    }

    @Override
    public double calcula() {
        return 10 + 7 + calculoDoOutroImposto();
    }
}
