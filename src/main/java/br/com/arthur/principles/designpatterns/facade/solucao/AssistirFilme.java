package br.com.arthur.principles.designpatterns.facade.solucao;

public class AssistirFilme {
    private Tv tv = new Tv();
    private Pipoca pipoca = new Pipoca();
    private Luz luz = new Luz();

    public void comecouFilme() {
        tv.ligaTv();
        pipoca.fazPipoca();
        luz.desligaLuz();
    }

    public void acabouFilme() {
        tv.desligaTv();
        luz.ligaLuz();
    }

}
