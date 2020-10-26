package br.com.arthur.principles.designpatterns.strategy.solucao;

public class Itau implements BancoStrategy {

    @Override
    public double calcula(Pagamento pagamento) {

        return 0;
    }
}
