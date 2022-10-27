package br.com.strategy;

public class Main {

    public static void main(String[] args) {
        /* existem diversas formas de implementar strategy
        
        pode ser tbm q vc tenha as implementacoes Sac() e Price()
        com interface chamada Tipo, se tiver 2 endpoints, um pra cada chamada
        teria, em um endpoint: Tipo tipo = new Sac()
        e no outro endpoint: Tipo tipo = new Price()

        mas esta é a ideia: tirar os ifs, e por 1 interface 
        */

        Pagamento pagamento = new Pagamento();
        BancoStrategy banco = BancoStrategy.cria(TiposDeBancos.ITAU);

        double resultado = new CalculaPagamento(banco).calcula(pagamento);
    }
}