//dessa forma o Iterator<Map.Entry<String,Integer>> ficaria escondido internamente
//na classe ContagemDePalavras
public class CalculadoraDeEstatisticas {

    public void aposGeracao(Ebook ebook){
        ContagemDePalavras contagemDePalavras = new ContagemDePalavras();

        contagemDePalavras.adicionaPalavra("Design");
        contagemDePalavras.adicionaPalavra("Design");
        contagemDePalavras.adicionaPalavra("Pattern");

        Iterator<ContagemDePalavras.Contagem> iterator = contagemDePalavras.iterator();

        while (iterator.hasNext()){
            ContagemDePalavras.Contagem contagem = iterator.next();
            System.out.println(contagem.palavra() + " - " + contagem.ocorrencias());
        }
    }
}