package br.com.arthur.principles.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Fila {
    private List<Comando> comandos = new ArrayList<>();

    public void adiciona(Comando comando) {
        this.comandos.add(comando);
    }

    public void processa(){
        comandos.forEach(comando -> {
            comando.executa();
        });
    }
}
