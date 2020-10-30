package br.com.arthur.principles.encapsulamento.problema;

import java.util.List;

public class Fatura {
    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor, List<Pagamento> pagamentos, boolean pago) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = pagamentos;
        this.pago = pago;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean b) {

    }
}
