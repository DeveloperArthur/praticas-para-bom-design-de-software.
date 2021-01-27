package br.com.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {
    List<AcoesAposRequest> acoes = new ArrayList<>();
    BancoDeDados bancoDeDados;
    SistemaExterno sistemaExterno;
    Serasa serasa;

    Service(bancoDeDados, sistemaExterno, serasa) {
        this.bancoDeDados = bancoDeDados;
        this.sistemaExterno = sistemaExterno;
        this.serasa = serasa;

        acoes = Arrays.asList(bancoDeDados, sistemaExterno, serasa)
    }

    public void executa() {
        acoes.stream().forEach(acao -> acao.executar());
    }
}
