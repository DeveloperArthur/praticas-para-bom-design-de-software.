package br.com.arthur.principles.designpatterns.abstractfactory.solucao;

public class Produto {
    private String nome;
    private int quantidade;
    private double valor;

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
