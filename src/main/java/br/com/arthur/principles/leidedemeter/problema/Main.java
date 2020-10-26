/*
A lei de demeter diz que nao devemos ter get.get.get
e que o ideal seria encapsular e fazer isto dentro da classe
*/
package br.com.arthur.principles.leidedemeter.problema;

public class Main {
    public static void main(String[] args) {
        Dono dono = new Dono();
        dono.getCachorro().getNome();
    }
}
