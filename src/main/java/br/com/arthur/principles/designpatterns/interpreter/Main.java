/*
* Solução em árvore que se auto avalia e dá um resultado final
Quando vc precisa interpretar alguma coisa, transforma as expressoes
* em classes e as expressoes se avaliam

muito usado para processamento de gramática
* */

package br.com.arthur.principles.designpatterns.interpreter;

public class Main {
    public static void main(String[] args) {
        //10+20
        Expressao conta = new Soma(new Numero(10), new Numero(20));

        //(10-5) + (2+10)
        Expressao esquerda = new Subtracao(new Numero(10), new Numero(5));
        Expressao direita = new Soma(new Numero(2), new Numero(10));
        Expressao soma = new Soma(esquerda, direita);

        int resultado = soma.avalia();
        System.out.println(resultado);
    }
}
