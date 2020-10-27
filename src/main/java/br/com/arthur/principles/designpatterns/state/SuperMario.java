package br.com.arthur.principles.designpatterns.state;

public class SuperMario implements MarioState {
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
        System.out.println("Pegou uma flor de fogo: Tornou-se Mario de fogo");
        return new MarioDeFogo();
    }

    @Override
    public MarioState colideComInimigo() {
        System.out.println("Colidiu com inimigo: Volta a ser Marinho");
        return new Mario();
    }

    @Override
    public String getTipo() {
        return "Super Mario";
    }
}
