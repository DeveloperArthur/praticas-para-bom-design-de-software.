/*
 * Permite a criação de novos objetos a partir de um modelo original
 * ou protótipo que é clonado para evitar criar um novo objeto utilizando
 * a palavra new, o que diminui o custo de memória.
 * veja que criamos o segundo shopping sem utilizar new
 * */

package br.com.arthur.principles.designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Shopping primeiroShopping = new Shopping();
        primeiroShopping.setNome("primeiro shopping");
        System.out.println(primeiroShopping.getNome());

        Shopping segundoShopping = (Shopping) primeiroShopping.clone();
        segundoShopping.setNome("segundo shopping");
        System.out.println(segundoShopping.getNome());

        Loja loja1 = new Loja();
        Loja loja2 = (Loja) loja1.clone();
    }

}
