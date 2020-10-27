/*
 * Imagina que nossas classes podem ser compostas por elas mesmas
 * Isso é um problema pq a variedade é infinita!!
 * Para isso usamos decorator!
 * */

package br.com.arthur.principles.designpatterns.decorator.problema;

public class Main {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto issComIcms = new ISSComICMS();
        Imposto issComIcmsComIcpp = new ISSComICMSComICPP();
    }
}
