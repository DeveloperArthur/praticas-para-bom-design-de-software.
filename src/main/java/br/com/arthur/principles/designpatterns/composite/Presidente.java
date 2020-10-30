package br.com.arthur.principles.designpatterns.composite;

public class Presidente extends Supervisor {
    public Presidente(String nome) {
        super(nome);
        this.nome = nome;
    }

    @Override
    public void printNome() {
        System.out.println(this.nome);
        this.funcionarios.forEach(funcionario -> {
            funcionario.printNome();
        });
    }

    @Override
    public void adiciona(Funcionario funcionario) {
    }

    @Override
    public void remove(Funcionario funcionario) {
    }
}
