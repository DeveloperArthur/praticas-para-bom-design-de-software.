package br.com.arthur.principles.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    private List<Estado> estadosSalvos = new ArrayList<>();

    public Estado rollback(int index) {
        return estadosSalvos.get(index);
    }

    public void adiciona(Estado estado) {
        estadosSalvos.add(estado);
    }
}
