/*
Pense uma coisa, quando voce precisar de outra classe
por exemplo Windows Phone, vc vai precisar implementar essa classe
e implementar todos os metodos dos outros nela
e em todas as classes um metodo para mandar mensagem pri WPhone...
Mediator resolve esse problema!
*/

package br.com.arthur.principles.designpatterns.mediator.problema;

public class Main {
    public static void main(String[] args) {
        Android android = new Android();
        android.mandaMensagemProIOS();

        IOS ios = new IOS();
        ios.mandaMensagemProAndroid();
    }
}
