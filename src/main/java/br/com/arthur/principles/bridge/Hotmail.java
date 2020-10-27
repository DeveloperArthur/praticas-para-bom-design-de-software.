package br.com.arthur.principles.designpatterns.bridge;

public class Hotmail implements Email {
    @Override
    public void salvaAssinatura() {
        System.out.println("implementacao");
        System.out.println("do");
        System.out.println("hotmail");
    }

    @Override
    public void atualizaAssinatura() {
        System.out.println("implementacao");
        System.out.println("do");
        System.out.println("hotmail");
    }

    @Override
    public void mandaEmail() {
        System.out.println("implementacao");
        System.out.println("do");
        System.out.println("hotmail");
    }
}
