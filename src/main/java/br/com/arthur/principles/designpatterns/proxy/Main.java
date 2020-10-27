package br.com.arthur.principles.designpatterns.proxy;

public class Main {
    public static void main(String[] args) {
        ContatoInterface contato = new ContatoProxy();
        contato.listar(1L);
    }
}
