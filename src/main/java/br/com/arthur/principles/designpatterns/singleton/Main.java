/*
 * Imagina que no seu sistema, por alguma razao
 * voce só pode ter 1 instancia do objeto Carro...
 * Para isso implementariamos o pattern singleton
 * */

package br.com.arthur.principles.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        CarroSingleton carro = CarroSingleton.getInstancia();
    }
}
