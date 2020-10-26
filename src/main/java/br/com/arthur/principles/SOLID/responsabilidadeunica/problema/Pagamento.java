/*
Como pode ver, essa classe nunca vai parar de crescer, quanto mais cargos, mais esse metodo cresce
Além disso, a classe deve ser responsavel por fazer apenas 1 coisa, e essa classe está fazendo muitas
*/

package br.com.arthur.principles.SOLID.responsabilidadeunica.problema;

public class Pagamento {
    private double salario;

    public double calculaPagamento(Funcionario funcionario) {
        if (funcionario.getCargo().equals("Desenvolvedor"))
            return dezPorcento();
        if (funcionario.getCargo().equals("Tester"))
            return vintePorcento();
        if (funcionario.getCargo().equals("Suporte"))
            return trintaPorcento();
        else throw new IllegalArgumentException("Tente novamente");
    }

    private double trintaPorcento() {
        return 0.30;
    }

    private double vintePorcento() {
        return salario * 0.20;
    }

    private double dezPorcento() {
        return salario * 0.10;
    }
}
