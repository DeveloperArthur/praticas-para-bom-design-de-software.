/*
 * Quando voce tem varias acoes pra executar, pode usar Observer
 * */

package br.com.arthur.principles.designpatterns.observer.problema;

public class VariasAcoes {
    private Banco banco;
    private Email email;
    private ERP erp;
    private SMS sms;

    public void executaVariasAcoes() {
        banco.salvaNoBanco();
        email.enviaPorEmail();
        erp.integraComERP();
        sms.enviaSMS();
    }
}
