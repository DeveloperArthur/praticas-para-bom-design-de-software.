package br.com.arthur.principles.encapsulamento.solucao;

import java.util.Collections;
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
        return Collections.unmodifiableList(pagamentos);
    }

    public boolean isPago() {
        return pago;
    }

    public void adicionaPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        if (valorTotalDosPagamentos() >= this.valor)
            this.pago = true;
    }

    private double valorTotalDosPagamentos() {
        double total = 0;
        for (Pagamento pagamento : this.pagamentos)
            total += pagamento.getValor();
        return total;
    }
}
