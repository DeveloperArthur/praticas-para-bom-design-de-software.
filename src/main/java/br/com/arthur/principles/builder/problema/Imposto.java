package br.com.arthur.principles.designpatterns.builder.problema;

public class Imposto {
    private boolean inss;
    private boolean icpc;
    private boolean ishh;
    private boolean pis;
    private boolean ajj;

    public Imposto(boolean inss, boolean icpc, boolean ishh, boolean pis, boolean ajj) {
        this.inss = inss;
        this.icpc = icpc;
        this.ishh = ishh;
        this.pis = pis;
        this.ajj = ajj;
    }

    public boolean isInss() {
        return inss;
    }

    public boolean isIcpc() {
        return icpc;
    }

    public boolean isIshh() {
        return ishh;
    }

    public boolean isPis() {
        return pis;
    }

    public boolean isAjj() {
        return ajj;
    }
}
