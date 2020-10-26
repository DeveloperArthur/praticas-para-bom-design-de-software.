/*
 * Pronto, paramos de perguntar toda hora pro objeto e mandamos ele fazer tudo
 * */

package br.com.arthur.principles.telldonotask.solucao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Alarme alarme = new Alarme();
        alarme.setData(LocalDate.of(2020, 10, 30));
    }
}
