/*
 * Repare que nesse exemplo temos uma classe legada, usuarioJDBC...
 * na nossa regra de negocio precisamos usar essa classe...
 * mas nao podemos depender da implementacao (inversão de dependencia)
 * o ideal seria que a classe legada implementasse uma interface
 * mas ela nao implementa e voce nao quer mexer nela, pq ela é legada...
 * neste caso, vamos construir um adaptador!
 * */

package br.com.arthur.principles.designpatterns.adapter.problema;

public class Main {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();
    }
}
