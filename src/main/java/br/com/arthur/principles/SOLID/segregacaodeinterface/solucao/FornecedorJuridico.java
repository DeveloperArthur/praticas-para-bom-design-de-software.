package br.com.arthur.principles.SOLID.segregacaodeinterface.solucao;

public class FornecedorJuridico implements FornecedorJuridicoInterface {
    private String cnpj;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    @Override
    public String cadastraCnpj() {
        return cnpj;
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
