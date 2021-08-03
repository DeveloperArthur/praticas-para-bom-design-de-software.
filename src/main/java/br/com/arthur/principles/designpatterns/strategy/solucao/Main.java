package br.com.strategy;

public class Main {

    public static void main(String[] args) {
        /*nas camadas de adaptadores (dao/controller) este objeto sera
        * instanciado e montado com seu respectivo banco
        * ou seja, vc tira seu if da regra de negocio*/
        Pagamento pagamento = new Pagamento();
        pagamento.setBanco(new Nubank());

        CalculaPagamento calculaPagamento = new CalculaPagamento(pagamento.getBanco());
        calculaPagamento.calcula(pagamento);
    }
}
