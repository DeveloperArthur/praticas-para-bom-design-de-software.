package padroes_arquiteturais_livro_martin_fowler.transaction_script;

import java.util.Date;

public class UseCase {
    private SomaLancamentos somaLancamentos;

    public void regraDeNegocio(){
        //logica de negocios aqui

        Double result = somaLancamentos.receitaLancada(1, new Date());
        if(result > 10){
            //mais logica de negocios aqui
        }

        //logica de negocios aqui
    }
}

/*
* Invés do caso de uso chamar diretamente o gateway,
* ou inves da service chamar a repository e executar
* toda essa lógica toda de somar lançamentos
* a lógica foi encapsulada dentro da classe
* e a classe que faz conexao com banco de dados
*/