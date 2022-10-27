package br.com.arthur.principles.designpatterns.strategy.solucao;

public class Santander implements BancoStrategy {

    @Override
    public double calcula(Pagamento pagamento) {
        System.out.println("santander");
        return 0;
    }
}
