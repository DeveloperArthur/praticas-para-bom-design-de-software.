/*
 * Olhe esta classe, para criar um imposto, precisamos passar valores booleanos
 * e nem sabemos que parametros sao esses, inss é o segundo ou o terceiro
 * parametro? Vamos precisar sair procurando na classe e isso nao é bom...
 * é dificil usar essa classe...
 * A solucao é usar Builder.
 * */

package br.com.arthur.principles.designpatterns.builder.problema;

public class Main {
    public static void main(String[] args) {
        Imposto imposto = new Imposto(true, false, true, false, true);
    }
}
