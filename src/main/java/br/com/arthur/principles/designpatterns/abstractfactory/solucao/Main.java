/*
Olha como é mais simples! Ao inves de ter uma classe NotaFiscal e Boleto com varios ifs
voce cria uma interface, e um tipo de nota fiscal e boleto para cada um que existe
no sistema... Quando tiver outra loja no sistema, é só criar uma classe
que implementa vendaFactory!
https://www.youtube.com/watch?v=aKnuX8kqpRM
 * */

package br.com.arthur.principles.designpatterns.abstractfactory.solucao;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Celula XYZ");
        produto.setQuantidade(3);
        produto.setValor(1234);

        VendaFactory vendaFactory = new LojaDeInformatica();
        Venda venda = new Venda(vendaFactory);

        venda.realizaVenda(produto);
    }
}
