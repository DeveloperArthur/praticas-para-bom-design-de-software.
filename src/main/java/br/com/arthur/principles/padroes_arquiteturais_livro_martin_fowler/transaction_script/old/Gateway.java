package padroes_arquiteturais_livro_martin_fowler.transaction_script;

import java.sql.*;

public class Gateway {
    private Connection db;
    private String declaracaoBuscaLancamentos =
            "SELECT quantia FROM lancamento " +
            "WHERE contrato = ? AND lancado <= ?";

    public ResultSet buscaLancamentoPor(long id, java.util.Date data) throws SQLException {
        PreparedStatement dec = db.prepareStatement(declaracaoBuscaLancamentos);
        dec.setLong(1, id);
        dec.setDate(2, (Date) data);
        ResultSet result = dec.executeQuery();
        return result;
    }
}
