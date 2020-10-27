/*
 Agora conseguimos reaproveitar instancias ja criadas!
 * */
package br.com.arthur.principles.designpatterns.flyweight.solucao;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        List<Nota> notas = Arrays.asList(musica.pegaNota("do"), musica.pegaNota("re"),
                musica.pegaNota("mi"), musica.pegaNota("fa"), musica.pegaNota("fa"));
    }
}
