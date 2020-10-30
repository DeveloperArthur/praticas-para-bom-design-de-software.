/*
Perceba que quando criamos o objeto Venda, passamos os 3 objetos..
O abstract factory vai resolver isto, nao vamos precisar passar
os objetos, vamos passar apenas uma interface!

 * Este padrão permite a criação de famílias de objetos relacionados
 * ou dependentes por meio de uma única interface e sem que a
 * classe concreta seja especificada.
 * */

package br.com.arthur.principles.designpatterns.abstractfactory.problema;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Celula XYZ");
        produto.setQuantidade(3);
        produto.setValor(1234);

        NotaFiscal notaFiscal = new NotaFiscal("SP");
        Boleto boleto = new Boleto("ITAU");

        Venda venda = new Venda(produto, boleto, notaFiscal);
        venda.realizaVenda();
    }
}
