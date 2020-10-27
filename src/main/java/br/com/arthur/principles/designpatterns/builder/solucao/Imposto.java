package br.com.arthur.principles.designpatterns.builder.solucao;

public class Imposto {
    private boolean inss;
    private boolean icpc;
    private boolean ishh;
    private boolean pis;
    private boolean ajj;

    public static class Builder {
        private boolean inss;
        private boolean icpc;
        private boolean ishh;
        private boolean pis;
        private boolean ajj;

        public Builder() {}

        public Builder comInss(boolean inss) {
            this.inss = inss;
            return this;
        }

        public Builder comIcpc(boolean icpc) {
            this.icpc = icpc;
            return this;
        }

        public Builder comIshh(boolean ishh) {
            this.ishh = ishh;
            return this;
        }

        public Builder comPis(boolean pis) {
            this.pis = pis;
            return this;
        }

        public Builder comAjj(boolean ajj) {
            this.ajj = ajj;
            return this;
        }

        public Imposto build() {
            Imposto imposto = new Imposto();
            imposto.inss = this.inss;
            imposto.icpc = this.icpc;
            imposto.ishh = this.ishh;
            imposto.pis = this.pis;
            imposto.ajj = this.ajj;
            return imposto;
        }
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
