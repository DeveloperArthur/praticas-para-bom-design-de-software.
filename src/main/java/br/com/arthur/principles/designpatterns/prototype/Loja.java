package br.com.arthur.principles.designpatterns.prototype;

public class Loja implements ICloneable {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Object clone() {
        return this;
    }
}
