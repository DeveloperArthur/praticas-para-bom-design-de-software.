package br.com.arthur.principles.designpatterns.abstractfactory.solucao;

public class NotaFiscalSaoPaulo implements NotaFiscalInterface {

    @Override
    public double calculaImposto(Produto produto) {
        double imposto = 0.18;
        return imposto * produto.getValor();
    }
}
