package br.com.meubuscadordecep.cliente;

//facade sendo utilizado para encapsular e abstrair integrações entre sistemas
public class Main {
    public static void main(String[] args) throws Exception {
        Endereco endereco = BuscadorDeCep.executa(cep);
    }
}