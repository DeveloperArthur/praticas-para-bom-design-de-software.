/*
 * Quando uma classe pode ter varios estados diferentes e cada estado pode ou nao fazer algo,
 * por exemplo, a classe Mario, no estado Invencivel, nao pode morrer...
 * Mas a classe Mario no estado Pequenino pode morrer, para nao encher o codigo de if,
 * criamos uma classe para cada estado, uma interface chamada Estado, e
 * nela estarao todos os metodos possivels, as classes dos estados vao implementar essa interface e
 * dizer se podem ou nao fazer algo na propria implementacao
 * (https://www.youtube.com/watch?v=Z_xGtNpar74)*/

package br.com.arthur.principles.designpatterns.state;

public class Main {
    public static void main(String[] args) {
        MarioState mario = new Mario();

        mario = mario.pegaCogumelo();
        mario = mario.pegaFlorDeFogo();
        mario = mario.pegaCogumelo();
        mario = mario.colideComInimigo();
        mario = mario.pegaEstrela();
        mario = mario.colideComInimigo();
        mario = mario.colideComInimigo();

        System.out.println("Estado final: " + mario.getTipo());
    }
}
