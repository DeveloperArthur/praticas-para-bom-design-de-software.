/*
 * Esse principio nao resolve um problema
 * é apenas mais um jeito de iterar em um loop
 * */

package br.com.arthur.principles.designpatterns.iterator;

public class Main {
    public static void main(String[] args) {
        Macaco[] macacos = new Macaco[4];

        macacos[0] = new Macaco("Arthur");
        macacos[1] = new Macaco("Wellingthon");
        macacos[2] = new Macaco("Matheus");
        macacos[3] = new Macaco("Mike");

        Iterator macaco = new MacacoIterator(macacos);
        while (macaco.hasNext()) {
            System.out.println(macaco.next());
        }
    }
}
