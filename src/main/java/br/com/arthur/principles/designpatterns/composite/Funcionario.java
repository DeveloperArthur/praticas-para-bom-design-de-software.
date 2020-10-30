package br.com.arthur.principles.designpatterns.composite;

public abstract class Funcionario {
    String nome;

    public void printNome() {
        System.out.println(this.nome);
    }

    protected abstract void adiciona(Funcionario funcionario);

    protected abstract void remove(Funcionario funcionario);
}
