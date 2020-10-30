package br.com.arthur.principles.designpatterns.abstractfactory.problema;

public class Venda {
    private Produto produto;
    private Boleto boleto;
    private NotaFiscal notaFiscal;

    public Venda(Produto produto, Boleto boleto, NotaFiscal notaFiscal) {
        this.produto = produto;
        this.boleto = boleto;
        this.notaFiscal = notaFiscal;
    }

    public void realizaVenda() {
        double total = 0;
        double imposto = notaFiscal.calculaImposto();
        total = imposto + produto.getValor();
        boleto.emitir();
    }
}
