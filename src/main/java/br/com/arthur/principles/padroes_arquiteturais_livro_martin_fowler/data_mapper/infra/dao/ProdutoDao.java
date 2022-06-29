package padroes_arquiteturais_livro_martin_fowler.data_mapper.infra.dao;

import padroes_arquiteturais_livro_martin_fowler.data_mapper.infra.entities.ProdutoEntity;
import padroes_arquiteturais_livro_martin_fowler.data_mapper.application.model.ProdutoModel;
import padroes_arquiteturais_livro_martin_fowler.data_mapper.infra.mapeadores.MapeadorDePessoa;

public class ProdutoDao {
    private MapeadorDePessoa mapeadorDePessoa;
    public ProdutoModel buscaProduto(Long id) {
        //logica para buscar no bando de dados
        ProdutoEntity produtoEntity = new ProdutoEntity(); //SELECT PROUTO FROM ...
        ProdutoModel produtoModel = mapeadorDePessoa.deEntityParaModel(produtoEntity);
        return produtoModel;
    }

    public void atualiza(ProdutoModel produto) {
        ProdutoEntity produtoEntity = mapeadorDePessoa.deModelParaEntity(produto);

        //UPDATE PESSOA ...
        //logica para atualizar no banco de dados
    }
}
