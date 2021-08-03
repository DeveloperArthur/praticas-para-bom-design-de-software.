package br.com.arthur.principles.designpatterns.strategy.solucao;

public class Pagamento {
    private BancoStrategy banco;

    public BancoStrategy getBanco() {
        return banco;
    }

    public void setBanco(BancoStrategy banco) {
        this.banco = banco;
    }
}
