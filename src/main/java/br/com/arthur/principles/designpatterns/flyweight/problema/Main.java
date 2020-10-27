/*
* Perceba que para criar uma nota, precisamos instanciar uma classe de nota varias vezes
* e se a nota tiver mil Do? Teremos mil instancias na memoria...
* A solucao é o flyweigth
* */
package br.com.arthur.principles.designpatterns.flyweight.problema;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Nota> musica = Arrays.asList(new Do(), new Re(), new Mi(), new Fa(), new Fa());
    }
}
