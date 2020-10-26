package br.com.arthur.principles.SOLID.openclosed.problema;

public class Animal {
    private String nome;
    private String raca;
    //etc...

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
