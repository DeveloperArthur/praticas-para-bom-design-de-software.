/*
* Façade diz que ao inves disto, podemos ter uma implementacao que
* ja instancia todas as classes!
* */

package br.com.arthur.principles.designpatterns.facade.problema;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Pipoca pipoca = new Pipoca();
        Luz luz = new Luz();

        //comecou filme
        tv.ligaTv();
        pipoca.fazPipoca();
        luz.desligaLuz();

        //acabou filme
        tv.desligaTv();
        luz.ligaLuz();
    }
}
