package br.com.arthur.principles.SOLID.segregacaodeinterface.problema;

public class FornecedorFisico implements Fornecedor {
    private String cpf;
    private String inscricaoEstadual;

    @Override
    public String cadastraCnpj() {
        throw new IllegalArgumentException("Fornecedor fisico nao tem esse dado");
    }

    @Override
    public String cadastraCpf() {
        return cpf;
    }

    @Override
    public String cadastraInscricaoEstadual() {
        return inscricaoEstadual;
    }

    @Override
    public String cadastraIncricaoMunicipal() {
        throw new IllegalArgumentException("Fornecedor fisico nao tem esse dado");
    }
}
