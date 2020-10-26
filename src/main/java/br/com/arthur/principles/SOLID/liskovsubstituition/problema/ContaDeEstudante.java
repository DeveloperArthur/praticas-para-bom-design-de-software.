/*
* Ou seja, estamos extendendo de conta comum, pois usamos a maioria dos atributos e
* metodos, mas elas tem 1 diferenca...
* o principio diz que devemos criar uma composição
* */

package br.com.arthur.principles.SOLID.liskovsubstituition.problema;

public class ContaDeEstudante extends ContaComum {

    @Override
    public void rendeNaPoupanca() {
        throw new IllegalArgumentException("conta de estudante nao rende");
    }
}
