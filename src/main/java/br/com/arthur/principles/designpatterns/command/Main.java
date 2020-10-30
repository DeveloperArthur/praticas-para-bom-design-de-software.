/*
* Veja que tinhamos um monte de comandos que precisavam ser executados
* em um outro momento, eu nao podia simplesmente ir no metodo main
* e dizer pedido1.paga(), é uma fila de trabalho, deve ser executado
* de maneira Assincrona, nesse caso usamos o Command, classes que
* encapsulam os comandos.
* */

package br.com.arthur.principles.designpatterns.command;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("ClienteABC", 10);
        Pedido pedido2 = new Pedido("ClienteBCS", 24);

        Fila fila = new Fila();
        fila.adiciona(new PagaPedido(pedido1));
        fila.adiciona(new ConcluiPedido(pedido2));

        fila.processa();
    }
}
