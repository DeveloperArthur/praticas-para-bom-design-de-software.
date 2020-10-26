/*
* Perceba que nas classes, alguns metodos devolvem erros... Porque fisico nao tem cnpj
* juridico nao tem cpf... E etc, o principio da segregacao de interface diz que
* "a classe só deve depender de métodos que ela usa", o certo seria criar
* uma interface para cada fornecedor
* */

package br.com.arthur.principles.SOLID.segregacaodeinterface.problema;

public interface Fornecedor {
    String cadastraCnpj();

    String cadastraCpf();

    String cadastraInscricaoEstadual();

    String cadastraIncricaoMunicipal();
}
