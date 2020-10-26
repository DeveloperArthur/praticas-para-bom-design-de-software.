package br.com.arthur.principles.SOLID.responsabilidadeunica.solucao;

public class VintePorcento implements RegraDeSalario {
    public double calcula(Funcionario funcionario) {
        return funcionario.getSalario() * 0.20;
    }
}
