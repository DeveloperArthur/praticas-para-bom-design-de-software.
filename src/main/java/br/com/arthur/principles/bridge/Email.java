/*
 * Bridge vai ser utilizado quando voce tem varias implementacoes
 * que fazem a mesma coisa, repare, gmail, hotmail e yahoo
 * precisam fazer a mesma coisa... mas obvio, cada com da sua maneira
 * deste modo criamos uma interface com os metodos que elas utilizam
 * */

package br.com.arthur.principles.designpatterns.bridge;

public interface Email {
    void salvaAssinatura();

    void atualizaAssinatura();

    void mandaEmail();
}
