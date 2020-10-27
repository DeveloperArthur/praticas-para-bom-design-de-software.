/*
Agora podemos ver perfeitamente cada parametro
*/

package br.com.arthur.principles.designpatterns.builder.solucao;

public class Main {
    public static void main(String[] args) {
        Imposto imposto = new Imposto.Builder()
                .comAjj(true)
                .comIcpc(false)
                .comInss(false)
                .comPis(true)
                .comPis(false)
                .build();
    }
}
