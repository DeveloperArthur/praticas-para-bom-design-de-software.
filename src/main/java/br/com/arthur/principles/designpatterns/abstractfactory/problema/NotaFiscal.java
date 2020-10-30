package br.com.arthur.principles.designpatterns.abstractfactory.problema;

public class NotaFiscal {
    private String estado;

    public NotaFiscal(String estado) {
        this.estado = estado;
    }

    public double calculaImposto() {
        if (estado.equals("SP"))
            return 18;
        if (estado.equals("RJ"))
            return 19;
        if (estado.equals("MG"))
            return 20;
        return 10;
    }
}
