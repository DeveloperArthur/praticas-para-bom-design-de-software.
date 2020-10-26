/*
De acordo com o principio open-closed, devemos poder mudar o comportamento de uma classe sem usar if's
e sem mexer nela nesse caso nao conseguimos... Mas na solucao vamos ver como é possivel
* */
package br.com.arthur.principles.SOLID.openclosed.problema;

public class ReproduzFalaDoAnimal {

    public void fala(Animal animal) {
        if (animal.getRaca().equals("Gato"))
            System.out.println("Miau");
        if (animal.getRaca().equals("Cachorro"))
            System.out.println("Au Au");
    }
}
