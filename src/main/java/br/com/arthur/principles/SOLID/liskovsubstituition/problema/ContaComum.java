package br.com.arthur.principles.SOLID.liskovsubstituition.problema;

public class ContaComum {
    private double saldo;

    public void deposita(){
        System.out.println(saldo);
    }

    public void rendeNaPoupanca(){
        System.out.println(saldo);
    }
}
