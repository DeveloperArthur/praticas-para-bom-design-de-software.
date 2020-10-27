package br.com.arthur.principles.designpatterns.iterator;

public class Macaco {
    private String nome;

    public Macaco(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
