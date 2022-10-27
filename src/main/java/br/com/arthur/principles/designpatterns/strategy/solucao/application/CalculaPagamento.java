//https://www.youtube.com/watch?v=pxmqkzWPW6E

package br.com.arthur.principles.designpatterns.strategy.solucao;

public class CalculaPagamento {
    private BancoStrategy banco;

    public CalculaPagamento(BancoStrategy banco) {
        this.banco = banco;
    }

    public double calcula(Pagamento pagamento) {
        return banco.calcula(pagamento);
    }
}
