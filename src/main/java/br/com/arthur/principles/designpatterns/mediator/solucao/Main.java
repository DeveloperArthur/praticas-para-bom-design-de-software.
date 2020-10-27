/*
 * https://www.youtube.com/watch?v=XId86icEYSA
 * */

package br.com.arthur.principles.designpatterns.mediator.solucao;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MensagemMediator();

        AndroidColleague android = new AndroidColleague(mediator);
        IOSColleague ios = new IOSColleague(mediator);
        BlackBerryColleague blackBerry = new BlackBerryColleague(mediator);

        mediator.adicionarColleague(android);
        mediator.adicionarColleague(ios);
        mediator.adicionarColleague(blackBerry);

        android.enviaMensagem("Ola sou android");
        ios.enviaMensagem("Ola android, beleza?");
        android.enviaMensagem("belezinha!");
    }
}
