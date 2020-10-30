/*
 * Encapsular significa esconder a implementação
 * Para saber se um método está bem encapsulado, basta responder as perguntas
 * O que o método faz? Se você conseguir saber o que o método faz pelo nome dele
 * isto é um sinal de que está bem encapsulado!
 * Como o método faz? Se você não sabe como o método faz, é outro indicio
 * de que está bem encapsulado!
 * */

package br.com.arthur.principles.encapsulamento.solucao;

import java.util.List;

public class ProcessadorDeBoleto {

    public void processa(List<Boleto> boletos, Fatura fatura) {
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.adicionaPagamento(pagamento);
        }
    }
}
