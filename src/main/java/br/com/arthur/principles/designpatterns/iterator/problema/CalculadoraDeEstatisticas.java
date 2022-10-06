//o encapsulamento de contagemDePalavras é quebrado no método entrySet
//o Map.Entry é um detalhe de implementação que é vazado para as classes
//que usam esse método, para resolver o problema seria interessante 
//ser possível percorrer com um for-each o próprio objeto da classe ContagemDePalavras
//e no lugar de Map.Entry, seria interessante definir uma classe de negócio que contenha
//uma palavra com a quantidade de ocorrências associada.
public class CalculadoraDeEstatisticas {

    public void aposGeracao(Ebook ebook){
        ContagemDePalavras contagemDePalavras = new ContagemDePalavras();

        contagemDePalavras.adicionaPalavra("Design");
        contagemDePalavras.adicionaPalavra("Design");
        contagemDePalavras.adicionaPalavra("Pattern");

        for(Map.Entry<String, Integer> contagem : contagemDePalavras.entrySet()){
            String palavra = contagem.getKey();
            Integer ocorrencias = contagem.getValue();
            System.out.println(palavra + " - " + ocorrencias);
        }
    }
}