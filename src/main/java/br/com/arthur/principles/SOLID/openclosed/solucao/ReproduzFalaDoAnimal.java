/*
 * Nós conseguimos mudar o comportamento da classe sem mexer nela
 * Passamos uma outra implementacao da interface
 */

package br.com.arthur.principles.SOLID.openclosed.solucao;

public class ReproduzFalaDoAnimal {

    public void fala(Animal animal) {
        animal.fala();
    }
}
