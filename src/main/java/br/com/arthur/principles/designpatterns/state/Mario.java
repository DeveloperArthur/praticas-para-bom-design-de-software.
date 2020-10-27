package br.com.arthur.principles.designpatterns.state;

public class Mario implements MarioState {
    @Override
    public MarioState pegaCogumelo() {
        System.out.println("Pegou um cogumelo: Tornou-se Super Mario");
        return new SuperMario();
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
        System.out.println("Colidiu com um inimigo: Mario morre");
        return new MarioMorto();
    }

    @Override
    public String getTipo() {
        return "Mario comum";
    }
}
