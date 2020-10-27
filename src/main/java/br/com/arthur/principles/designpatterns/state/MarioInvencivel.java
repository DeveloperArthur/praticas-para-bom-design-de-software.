package br.com.arthur.principles.designpatterns.state;

public class MarioInvencivel implements MarioState {
    @Override
    public MarioState pegaCogumelo() {
        System.out.println("Pegou um cogumelo: Seu estado ainda é invencivel");
        return this;
    }

    @Override
    public MarioState pegaEstrela() {
        System.out.println("Pegou uma estrela: Mario está invencível");
        return this;
    }

    @Override
    public MarioState pegaFlorDeFogo() {
        System.out.println("Pegou uma flor de fogo: Mario atira fogo e continua invencivel");
        return this;
    }

    @Override
    public MarioState colideComInimigo() {
        System.out.println("Colidiu com inimigo: O inimigo morreu");
        return this;
    }

    @Override
    public String getTipo() {
        return "Mario invencivel";
    }
}
