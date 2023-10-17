package com.globo.jv.sales.domain.strategy;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {

  // repare que nessa solução cada endpoint instancia a implementação

  ProcessaInvestimento processaInvestimento;

  @PostMapping("/sac")
  public String sac(@RequestBody Investimento investimento) {
    TipoFinanciamento tipoFinanciamento = new TabelaSac();
    processaInvestimento = new ProcessaInvestimento(tipoFinanciamento);
    processaInvestimento.processa(investimento);
    return "{}";
  }

  @PostMapping("/price")
  public String price(@RequestBody Investimento investimento) {
    TipoFinanciamento tipoFinanciamento = new TabelaPrice();
    processaInvestimento = new ProcessaInvestimento(tipoFinanciamento);
    processaInvestimento.processa(investimento);
    return "{}";
  }
}