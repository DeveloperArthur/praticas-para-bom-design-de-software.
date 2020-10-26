package br.com.arthur.principles.SOLID.openclosed.problema;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setRaca("Cachorro");
        ReproduzFalaDoAnimal reproduzFala = new ReproduzFalaDoAnimal();
        reproduzFala.fala(animal);
    }
}
