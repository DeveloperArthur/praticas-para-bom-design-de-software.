package br.com.arthur.principles.designpatterns.composite;

public class Caixa extends Funcionario {
    public Caixa(String nome) {
        this.nome = nome;
    }

    @Override
    public void printNome() {
        System.out.println(this.nome);
    }

    @Override
    public void adiciona(Funcionario funcionario) {
    }

    @Override
    public void remove(Funcionario funcionario) {
    }
}
