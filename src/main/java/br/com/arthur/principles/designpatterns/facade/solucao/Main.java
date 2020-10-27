package br.com.arthur.principles.designpatterns.facade.solucao;

public class Main {
    public static void main(String[] args) {
        AssistirFilme assistirFilme = new AssistirFilme();

        assistirFilme.comecouFilme();

        assistirFilme.acabouFilme();
    }
}
