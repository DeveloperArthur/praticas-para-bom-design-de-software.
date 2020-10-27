package br.com.arthur.principles.designpatterns.memento;

import java.time.LocalDate;

public class Contrato {
    private LocalDate data;
    private String cliente;
    private TipoDeContrato tipoDeContrato;

    public Contrato(LocalDate data, String cliente, TipoDeContrato tipoDeContrato) {
        this.data = data;
        this.cliente = cliente;
        this.tipoDeContrato = tipoDeContrato;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public TipoDeContrato getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void avanca() {
        if (tipoDeContrato.equals(TipoDeContrato.NOVO)) tipoDeContrato = TipoDeContrato.EM_ANDAMENTO;
        else if (tipoDeContrato.equals(TipoDeContrato.EM_ANDAMENTO)) tipoDeContrato = TipoDeContrato.ACERTADO;
        else if (tipoDeContrato.equals(TipoDeContrato.ACERTADO)) tipoDeContrato = TipoDeContrato.CONCLUIDO;
    }

    public Estado salvaEstado() {
        return new Estado(new Contrato(this.data, this.cliente, this.tipoDeContrato));
    }
}
