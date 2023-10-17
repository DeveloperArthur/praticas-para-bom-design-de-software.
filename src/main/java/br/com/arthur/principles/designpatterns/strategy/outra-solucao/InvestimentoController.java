package com.globo.jv.sales.domain.strategy;

@RestController
@RequestMapping("/investimento")
public class InvestimentoController {

  // repare que neste caso cada endpoint instancia a implementação

  ProcessaInvestimento processaInvestimento;

  @PostMapping("/sac")
  public String sac(@RequestBody Investimento investimento) {
    processaInvestimento = new ProcessaInvestimento(new TabelaSac());
    processaInvestimento.processa(investimento);
    return "{}";
  }

  @PostMapping("/price")
  public String price(@RequestBody Investimento investimento) {
    processaInvestimento = new ProcessaInvestimento(new TabelaPrice());
    processaInvestimento.processa(investimento);
    return "{}";
  }
}