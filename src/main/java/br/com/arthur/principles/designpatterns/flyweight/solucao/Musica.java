package br.com.arthur.principles.designpatterns.flyweight.solucao;

import java.util.HashMap;
import java.util.Map;

public class Musica {
    private static Map<String, Nota> notas = new HashMap<>();

    //construtor static da classe, é executado quando a JVM carrega essa classe
    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
    }

    public Nota pegaNota(String nota){
        return notas.get(nota);
    }
}
