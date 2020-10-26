/*
Pronto, cria uma classe e use como atributo
 */

package br.com.arthur.principles.SOLID.liskovsubstituition.solucao;

public class Conta {
    private double saldo;

    public void deposita() {
        System.out.println(saldo);
    }

    public void rendeNaPoupanca() {
        System.out.println(saldo);
    }
}
