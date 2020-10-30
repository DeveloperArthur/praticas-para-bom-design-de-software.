package br.com.arthur.principles.designpatterns.abstractfactory.solucao;

public class LojaDeInformatica implements VendaFactory {

    @Override
    public NotaFiscalInterface criaNotaFiscal() {
        NotaFiscalInterface notaFiscal = new NotaFiscalSaoPaulo();
        return notaFiscal;
    }

    @Override
    public BoletoInterface criaBoleto() {
        BoletoInterface boleto = new BoletoBradesco();
        return boleto;
    }
}
