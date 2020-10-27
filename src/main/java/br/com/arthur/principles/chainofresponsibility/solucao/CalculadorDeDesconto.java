/*
* Pronto! Ao inves de if's, montamos uma cadeia de regras.
* */

package br.com.arthur.principles.designpatterns.chainofresponsibility.solucao;

public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento) {
        Desconto primeiroDesconto = new DescontoPorCincoItens();
        Desconto segundoDesconto = new DescontoPorMaisDeQuinheirosReais();
        Desconto semDesconto = new SemDesconto();

        primeiroDesconto.setProximo(segundoDesconto);
        segundoDesconto.setProximo(semDesconto);

        return primeiroDesconto.desconta(orcamento);
    }
}
