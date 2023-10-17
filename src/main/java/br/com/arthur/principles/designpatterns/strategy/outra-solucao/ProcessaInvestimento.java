package com.globo.jv.sales.domain.strategy;

public class ProcessaInvestimento {
  private TipoFinanciamento tipoFinanciamento;

  public ProcessaInvestimento(TipoFinanciamento tipoFinanciamento) {
    this.tipoFinanciamento = tipoFinanciamento;
  }

  public void processa(Investimento investimento) {
    tipoFinanciamento.processa(investimento);
  }
}
