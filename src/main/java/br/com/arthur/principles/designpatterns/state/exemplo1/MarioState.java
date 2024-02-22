package br.com.arthur.principles.designpatterns.state.exemplo1;

public interface MarioState {
    MarioState pegaCogumelo();

    MarioState pegaEstrela();

    MarioState pegaFlorDeFogo();

    MarioState colideComInimigo();

    String getTipo();
}
