package br.com.arthur.principles.designpatterns.singleton;

public class CarroSingleton {
    private static CarroSingleton instancia = null;

    private CarroSingleton() {
    }

    public static CarroSingleton getInstancia() {
        if (instancia == null) {
            instancia = new CarroSingleton();
        }
        return instancia;
    }
}
