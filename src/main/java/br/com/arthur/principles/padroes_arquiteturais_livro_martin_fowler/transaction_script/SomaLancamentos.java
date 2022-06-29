package padroes_arquiteturais_livro_martin_fowler.transaction_script;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

//este é o roteiro de transação
//calcula o total de lançamentos até uma determinada data
public class SomaLancamentos {
    private Gateway gateway;

    public Double receitaLancada(long contrato, Date data){
        try {
            ResultSet rs = gateway.buscaLancamentoPor(contrato, data);
            while (rs.next()){
                //soma os lancamentos
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
