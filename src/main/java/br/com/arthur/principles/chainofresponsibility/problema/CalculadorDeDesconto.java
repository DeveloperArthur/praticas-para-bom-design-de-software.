/*
* Esse principio é usado quando vc precisa encadiar regras de negocio
* sem encher a classe de if's
* */

package br.com.arthur.principles.designpatterns.chainofresponsibility.problema;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.10;
        } else if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }
        return 0;
    }
}
