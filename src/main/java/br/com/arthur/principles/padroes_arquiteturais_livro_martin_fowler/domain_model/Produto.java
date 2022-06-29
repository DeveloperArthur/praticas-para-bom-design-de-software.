package padroes_arquiteturais_livro_martin_fowler.domain_model;

import java.util.List;

//uma classe que representa uma tabela no banco de dados
//modelo rico
public class Produto {
    private String nome;
    private List<LancamentoDeReceitas> receitas;

    public void canculaLancamentoDeReceitas(){
        receitas.forEach(r -> {
            //calcula
        });
    }
}
