package padroes_arquiteturais_livro_martin_fowler.data_mapper.infra.mapeadores;

import padroes_arquiteturais_livro_martin_fowler.data_mapper.infra.entities.ProdutoEntity;
import padroes_arquiteturais_livro_martin_fowler.data_mapper.application.model.ProdutoModel;

public class MapeadorDePessoa {
    public ProdutoEntity deModelParaEntity(ProdutoModel model){
        return new ProdutoEntity(model.getNome(), model.getPreco());
    }

    public ProdutoModel deEntityParaModel(ProdutoEntity entity){
        return new ProdutoModel(entity.getId(), entity.getNome(), entity.getPreco());
    }
}
