public class ContagemDePalavras {
    private Map<String, Integer> map = new TreeMap<>();

    Set<Map.Entry<String, Integer>> entrySet(){
        return map.entrySet();
    }

    void adicionaPalavra(String palavra){
        Integer contagem = map.get(palavra);

        if(contagem != null){
            contagem++;
        }else {
            contagem = 1;
        }
        map.put(palavra, contagem);
    }
}