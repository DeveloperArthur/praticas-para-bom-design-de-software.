package br.com.arthur.principles.designpatterns.state;

public interface MarioState {
    MarioState pegaCogumelo();

    MarioState pegaEstrela();

    MarioState pegaFlorDeFogo();

    MarioState colideComInimigo();

    String getTipo();
}
