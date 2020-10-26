package br.com.arthur.principles.SOLID.responsabilidadeunica.solucao;

public class DezPorcento implements RegraDeSalario {

    public double calcula(Funcionario funcionario) {
        return funcionario.getSalario() * 0.10;
    }
}