package br.com.arthur.principles.designpatterns.visitor;

public class Numero implements Expressao {
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public void aceita(Visitor visitor) {
        visitor.visitaNumero(this);
    }

    public int getNumero() {
        return numero;
    }
}
