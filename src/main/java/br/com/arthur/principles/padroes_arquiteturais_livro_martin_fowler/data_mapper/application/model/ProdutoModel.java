package padroes_arquiteturais_livro_martin_fowler.data_mapper.application.model;

public class ProdutoModel {
    private Long id;
    private String nome;
    private Double preco;

    public ProdutoModel(Long id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void isAtivado(boolean b) {

    }
}
