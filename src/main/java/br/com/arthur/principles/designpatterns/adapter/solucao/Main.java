/*
Pronto, construimos uma interface e um adaptador, agora nosso main depende da interface
e sim, o adapter vai depender da implementacao neste caso...

outro exemplo de impl adapter em outro cenario: 
https://github.com/DeveloperArthur/CQRS-with-RabbitMQ-Redis-InfraAsCode/blob/main/src/main/java/br/com/arthur/cqrs/infra/JsonUtilAdapterWithGson.java
*/

package br.com.arthur.principles.designpatterns.adapter.solucao;

public class Main {
    public static void main(String[] args) {
        UsuarioInterface usuarioInterface = new UsuarioAdapter();
        usuarioInterface.salva();
        usuarioInterface.atualiza();
    }
}
