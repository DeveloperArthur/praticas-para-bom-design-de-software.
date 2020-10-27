/*
 * Quando vc tem metodo que é caro, é demorado e consome mais processamento
 * o ideal é que esse metodo nao seja chamado desnecessariamente
 * entao vc cria uma classe que primeiro verifica se essa lista (por exemplo) esta nula
 * se tiver, chama o metodo da consulta cara,
 * se nao tiver nulo, entao em algum momento ja foi carregada essa lista, nao precisa rodar de novo,
 * apenas rode o metodo para listar.
 * (https://www.youtube.com/watch?v=KMudd2R5Y4c)
 * */

package br.com.arthur.principles.designpatterns.proxy;

import java.util.List;

public class ContatoProxy implements ContatoInterface {
    private Long idDaListaDeContatos;
    private Contato contato;

    @Override
    public List<String> listar(Long idDaListaDeContatos) {
        if (contato == null) {
            contato = new Contato();
        }
        return contato.listar(idDaListaDeContatos);
    }
}
