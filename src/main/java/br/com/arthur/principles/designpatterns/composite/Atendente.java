package br.com.arthur.principles.designpatterns.composite;

public class Atendente extends Funcionario {
    public Atendente(String nome) {
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
