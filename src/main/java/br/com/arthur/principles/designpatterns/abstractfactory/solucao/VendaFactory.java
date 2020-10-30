package br.com.arthur.principles.designpatterns.abstractfactory.solucao;

public interface VendaFactory {
    NotaFiscalInterface criaNotaFiscal();

    BoletoInterface criaBoleto();
}
