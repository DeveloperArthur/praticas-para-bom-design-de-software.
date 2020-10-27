package br.com.arthur.principles.designpatterns.proxy;

import java.util.Arrays;
import java.util.List;

public class Contato implements ContatoInterface {
    private Long idDaListaDeContatos;
    private List<String> listaDeContatos;

    @Override
    public List<String> listar(Long idDaListaDeContatos) {
        return Arrays.asList("1111", "2222", "3333");
    }
}
