/*
* Perceba que cada banco, a classe vai crescer mais
* alem disso, estamos criando dependencia com as classes de bancos.
* semelhante ao open-closed, quando vamos usar strategy, precisamos
* conseguir mudar o comportamento da classe sem alterar ela
* */

package br.com.arthur.principles.designpatterns.strategy.problema;

public class CalculaPagamento {

    public double calcula(Pagamento pagamento) {
        if (pagamento.getBanco().equals("Itau"))
            new Itau().calcula(pagamento);
        if (pagamento.getBanco().equals("Santander"))
            new Santander().calcula(pagamento);
        if (pagamento.getBanco().equals("Nubank"))
            new Nubank().calcula(pagamento);
        return 0.0;
    }
}
