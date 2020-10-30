/*
Usado para navegar por uma árvore para fazer algo, como uma estrutura de dados.
* */

package br.com.arthur.principles.designpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        Visitor visitor = new Visitor();
        soma.aceita(visitor);
    }
}
