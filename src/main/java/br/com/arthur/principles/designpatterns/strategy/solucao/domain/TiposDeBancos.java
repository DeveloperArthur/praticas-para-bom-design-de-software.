package br.com.arthur.principles.designpatterns.strategy.solucao;

public enum TiposDeBancos {
    ITAU(new Itau()),
    SANTANDER(new Santander()),
    NUBANK(new Nubank())
    
    private BancoStrategy banco;

    TiposDeBancos(BancoStrategy banco) {
        this.banco = banco;
    }

    public BancoStrategy getImplDoBanco() {
        return banco;
    }
}