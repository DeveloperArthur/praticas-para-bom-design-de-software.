package br.com.arthur.principles.SOLID.segregacaodeinterface.solucao;

public class FornecedorFisico implements FornecedorFisicoInterface {
    private String cpf;
    private String inscricaoEstadual;

    @Override
    public String cadastraCpf() {
        return cpf;
    }

    @Override
    public String cadastraInscricaoEstadual() {
        return inscricaoEstadual;
    }
}
