package br.com.arthur.principles.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Supervisor extends Funcionario {
    List<Funcionario> funcionarios = new ArrayList<>();

    public Supervisor(String nome) {
        this.nome = nome;
    }

    @Override
    public void printNome() {
        System.out.println(this.nome);
    }

    public void adiciona(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void remove(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }
}
