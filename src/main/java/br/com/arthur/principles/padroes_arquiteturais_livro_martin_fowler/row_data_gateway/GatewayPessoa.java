package padroes_arquiteturais_livro_martin_fowler.row_data_gateway;

import java.sql.*;

//utilizado com transaction script, mas nao recomendavel com domain model
//tem todos os atributos da tabela e faz operacoes na tabela
//a partir disso, pode ter um transaction script que utilize essas operacoes
public class GatewayPessoa {
    private String sqlAtualizacao = "UPDATE pessoas set sobrenome = ?, nome = ?, numeroDependentes = ? where id = ?";
    private Connection db;
    private String sobrenome;
    private String nome;
    private int numeroDeDependentes;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
    }

    public void atualizar() throws SQLException {
        PreparedStatement dec = db.prepareStatement(sqlAtualizacao);
        dec.setString(1, sobrenome);
        dec.setString(2, nome);
        dec.setString(3, nome);
        dec.execute();
    }
}
