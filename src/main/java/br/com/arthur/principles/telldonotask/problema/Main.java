/*
* Perceba quantas vezes estamos perguntando para o objeto seus dados, cada get é uma pergunta
* toda vez q vc for setar uma data no alarme, sera q duplicar esse codigo
* vamos encapsular de acordo com o principio*/

package br.com.arthur.principles.telldonotask.problema;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alarme alarme = new Alarme();
        alarme.setData(LocalDate.of(2020, 10, 30));
        if (alarme.getData().isAfter(alarme.getLimite())) {
            alarme.avisa(alarme.getNome() + " muito longe!");
        }
    }
}
