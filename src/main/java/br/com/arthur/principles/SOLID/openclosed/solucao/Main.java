package br.com.arthur.principles.SOLID.openclosed.solucao;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Gato();
        ReproduzFalaDoAnimal reproduzFala = new ReproduzFalaDoAnimal();
        reproduzFala.fala(animal);
    }
}
