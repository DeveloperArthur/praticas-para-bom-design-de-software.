package br.com.arthur.principles.designpatterns.strategy.solucao;

public class Nubank implements BancoStrategy{

    @Override
    public double calcula(Pagamento pagamento) {
        System.out.println("nubank");
        return 0;
    }
}
