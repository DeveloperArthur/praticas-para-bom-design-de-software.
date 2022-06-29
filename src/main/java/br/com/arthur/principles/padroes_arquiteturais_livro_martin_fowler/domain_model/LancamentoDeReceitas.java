package padroes_arquiteturais_livro_martin_fowler.domain_model;

import java.util.Date;

//uma classe que representa uma tabela no banco de dados
//modelo anemico
public class LancamentoDeReceitas {
    private Double quantia;
    private Date data;

    public LancamentoDeReceitas(Double quantia, Date data) {
        this.quantia = quantia;
        this.data = data;
    }
}
