//https://www.youtube.com/watch?v=pxmqkzWPW6E

package br.com.arthur.principles.designpatterns.strategy.solucao;

public class CalculaPagamento {
    private BancoStrategy bancoStrategy;

    public CalculaPagamento(BancoStrategy bancoStrategy) {
        this.bancoStrategy = bancoStrategy;
    }

    public double calcula(Pagamento pagamento) {
        return bancoStrategy.calcula(pagamento);
    }
}
