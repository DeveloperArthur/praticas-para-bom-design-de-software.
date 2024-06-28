package padroes_arquiteturais_livro_martin_fowler.active_record;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
Row Data Gateway e Active Record
que são padrões de acesso a dados
em que objetos espelham linhas de
banco de dados e possuem funções de
manipulação de banco de dados.
Um Row Data Gateway não tem lógica
de negócios, portanto, um Active Record
é um tipo de Row Data Gateway
que possui lógica de negócios.
*/

public class Pessoa {
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

    public void darBaixaDaNotaFiscal() throws SQLException {
        //logica de negocios

        if(numeroDeDependentes > 9){
            //logica de negocios
        }

        //logica de negocios

        atualizar();
    }
}

//Minha conversa com Vaughn Vernon sobre o uso do Pattern Active Record
//https://www.linkedin.com/posts/arthursantosalmeida_minha-conversa-com-vaughn-vernon-sobre-design-activity-7212568639588204544-rdh3
