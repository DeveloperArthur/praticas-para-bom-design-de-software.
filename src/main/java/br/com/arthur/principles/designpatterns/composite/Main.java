/*
Padrão de projeto de software utilizado para representar um objeto
formado pela composição de objetos similares.
Este conjunto de objetos pressupõe uma mesma hierarquia
de classes a que ele pertence.
https://www.youtube.com/watch?v=cE9ZBNAbSAg
https://github.com/nayara-student/pattern-design-composite/blob/master/CompositeUML.png
*/

package br.com.arthur.principles.designpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Funcionario presidente = new Presidente("Arthur");
        Funcionario gerente = new Gerente("Gabi");
        Funcionario atendente = new Atendente("Mike");
        Funcionario atendente2 = new Atendente("Isa");
        Funcionario atendente3 = new Atendente("Wellingthon");
        Funcionario caixa = new Caixa("Pereira");
        Funcionario caixa2 = new Caixa("Matheus");

        presidente.adiciona(gerente);

        gerente.adiciona(atendente);
        gerente.adiciona(atendente2);
        gerente.adiciona(atendente3);

        atendente.adiciona(caixa);
        atendente.adiciona(caixa2);
    }
}
