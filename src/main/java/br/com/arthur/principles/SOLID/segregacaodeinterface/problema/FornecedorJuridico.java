package br.com.arthur.principles.SOLID.segregacaodeinterface.problema;

public class FornecedorJuridico implements Fornecedor {
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    @Override
    public String cadastraCnpj() {
        return cnpj;
    }

    @Override
    public String cadastraCpf() {
        throw new IllegalArgumentException("Fornecedor juridico nao tem esse dado");
    }

    @Override
    public String cadastraInscricaoEstadual() {
        return inscricaoEstadual;
    }

    @Override
    public String cadastraIncricaoMunicipal() {
        return inscricaoMunicipal;
    }
}
