package br.com.strategy;

public class Main {

  public static void main(String[] args) {
    /*
    nesse caso foi utilizado enum, cada opção de banco
    do enum contém sua respectiva implementação, e no
    Main usamos o valueOf() para pegar o enum, e o
    valor usado no valueOf() vem do banco de dados.
    mas existem diversas formas de implementar strategy
    pode-se também utilizar uma factory dentro da interface
    strategy com o if encapsulado lá dentro entre outras soluções
    mas esta é a ideia: usar polimorfismo para tirar os ifs da regra de negócio
    */

    Pagamento pagamento = Pagamento.query("SELECT banco_utilizado FROM pagamento WHERE.....");

    //pega o banco que vem do database, converte em um enum
    TiposDeBancos enumBanco = TiposDeBancos.valueOf(pagamento.getBancoUtilizadoNaCompra().toUpperCase());

    //pega a classe de implementacao do enum
    BancoStrategy banco = enumBanco.getImplDoBanco();

    //instancia a classe CalculaPagamento passando banco no construtor
    CalculaPagamento calculaPagamento = new CalculaPagamento(banco);

    double resultado = calculaPagamento.calcula(pagamento);
  }

}