package br.com.arthur.principles.SOLID.liskovsubstituition.solucao;

public class ContaComum {
    private Conta conta;

    public void rendeNaPoupanca() {
        conta.rendeNaPoupanca();
    }
}
