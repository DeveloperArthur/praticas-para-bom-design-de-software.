package padroes_arquiteturais_livro_martin_fowler.data_mapper.application.service;

import padroes_arquiteturais_livro_martin_fowler.data_mapper.infra.dao.ProdutoDao;
import padroes_arquiteturais_livro_martin_fowler.data_mapper.application.model.ProdutoModel;

public class ProdutoServiceImpl {
    private ProdutoDao dao;

    public void desativaProdutoNoEstoque(Long id){
        ProdutoModel produto = dao.buscaProduto(id);
        produto.isAtivado(false);
        dao.atualiza(produto);
    }
}
