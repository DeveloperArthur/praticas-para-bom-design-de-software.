/*
Pronto! Criamos uma classe para cada regra, criamos uma interface que todas implementam
e no Enum, cada cargo gera a instancia de uma classe
*/

package br.com.arthur.principles.SOLID.responsabilidadeunica.solucao;


public class Pagamento {
    private double salario;

    public double calculaPagamento(Funcionario funcionario) {
        return funcionario.getCargo().getRegraDeSalario().calcula(funcionario);
    }
}
