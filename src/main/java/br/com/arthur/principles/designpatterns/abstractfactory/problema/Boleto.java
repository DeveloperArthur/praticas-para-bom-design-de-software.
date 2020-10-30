package br.com.arthur.principles.designpatterns.abstractfactory.problema;

public class Boleto {
    private String banco;

    public Boleto(String banco) {
        this.banco = banco;
    }

    public void emitir() {
        if (banco.equals("ITAU")) {
            //implementa
        }
        if (banco.equals("BRADESCO")) {
            //implementa
        }
        if (banco.equals("BRASIL")) {
            //implementa
        }
    }
}
