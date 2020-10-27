/*
* quando vc precisa recuperar um estado de um objeto, como se fosse um rollback, por exemplo:
Contrato tem os Estados EM ANDAMENTO ESPERANDO CONCLUIDO CANCELADO
e vc deu um estado.esta(EM ANDAMENTO)
e depois estado.esta(ESPERANDO)
e digamos que voce queira voltar no estado anterior
a solução memento: guarda os estados em uma lista, e depois só recupera esses estados
* */

package br.com.arthur.principles.designpatterns.memento;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Historico historico = new Historico();
        Contrato arthur = new Contrato(LocalDate.now(), "Arthur", TipoDeContrato.NOVO);
        historico.adiciona(arthur.salvaEstado());

        arthur.avanca();
        historico.adiciona(arthur.salvaEstado());

        arthur.avanca();
        historico.adiciona(arthur.salvaEstado());

        Estado estadoAnterior = historico.rollback(1);
        System.out.println(estadoAnterior.getContrato().getTipoDeContrato());
    }
}
