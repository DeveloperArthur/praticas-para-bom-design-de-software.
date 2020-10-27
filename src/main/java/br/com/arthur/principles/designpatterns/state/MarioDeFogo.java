package br.com.arthur.principles.designpatterns.state;

public class MarioDeFogo implements MarioState {
    @Override
    public MarioState pegaCogumelo() {
        System.out.println("Pegou um cogumelo: Mais 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegaEstrela() {
        System.out.println("Pegou uma estrela: Tornou-se Mario Invencivel");
        return new MarioInvencivel();
    }

    @Override
    public MarioState pegaFlorDeFogo() {
        System.out.println("Pegou uma flor de fogo: Continua com poderes de fogo");
        return this;
    }

    @Override
    public MarioState colideComInimigo() {
        System.out.println("Colidiu com inimigo: Volta a ser Super Mario");
        return new SuperMario();
    }

    @Override
    public String getTipo() {
        return "Mario de fogo";
    }
}
