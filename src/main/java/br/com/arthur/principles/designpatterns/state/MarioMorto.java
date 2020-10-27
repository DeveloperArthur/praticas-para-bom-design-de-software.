package br.com.arthur.principles.designpatterns.state;

public class MarioMorto implements MarioState {
    @Override
    public MarioState pegaCogumelo() {
        return this;
    }

    @Override
    public MarioState pegaEstrela() {
        return this;
    }

    @Override
    public MarioState pegaFlorDeFogo() {
        return this;
    }

    @Override
    public MarioState colideComInimigo() {
        return this;
    }

    @Override
    public String getTipo() {
        return "Mario morreu";
    }
}
