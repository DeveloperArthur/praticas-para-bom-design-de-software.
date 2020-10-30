package br.com.arthur.principles.designpatterns.abstractfactory.solucao;

public class Venda {
    private BoletoInterface boleto;
    private NotaFiscalInterface notaFiscal;

    public Venda(VendaFactory vendaFactory) {
        this.notaFiscal = vendaFactory.criaNotaFiscal();
        this.boleto = vendaFactory.criaBoleto();
    }

    public void realizaVenda(Produto produto) {
        double imposto = notaFiscal.calculaImposto(produto);
        boleto.emite(produto, imposto);
    }
}
