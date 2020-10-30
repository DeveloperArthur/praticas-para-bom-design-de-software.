/*
Perceba o problema dessa classe, e se futuramente eu precisar
processar cartao de credito? Teremos que duplicar este código
e quando a regra mudar, teremos que ir em todas as classes que
processam e sair mudando... Está regra precisa estar escondida
na fatura, a fatura que deve saber se ela está paga ou nao!
 * */

package br.com.arthur.principles.encapsulamento.problema;

import java.util.List;

public class ProcessadorDeBoleto {

    public void processa(List<Boleto> boletos, Fatura fatura) {
        double total = 0;
        for (Boleto boleto : boletos) {
            Pagamento pagamento = new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO);
            fatura.getPagamentos().add(pagamento);
            total += boleto.getValor();
        }
        if (fatura.getValor() >= total)
            fatura.setPago(true);
    }
}
