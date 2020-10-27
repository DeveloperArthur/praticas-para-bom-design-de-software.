package br.com.arthur.principles.designpatterns.observer.solucao;

import java.util.List;

public class VariasAcoes {
    private List<AcoesAposX> acoes;

    public void executaVariasAcoes() {
        acoes.stream().forEach(acao -> acao.executa());
    }
}
