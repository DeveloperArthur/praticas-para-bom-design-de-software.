/*
* Perceba, as duas classes fazem a mesma coisa, porem, de maneira diferente
* com isso podemos implementar template method, criar uma classe template!
* */

package br.com.arthur.principles.designpatterns.templatemethod.problema;

public class ClasseA {
    private double valor;

    public double calculo() {
        if (this.valor > 2) {
            return 3 * 4;
        }
        return 0;
    }
}
