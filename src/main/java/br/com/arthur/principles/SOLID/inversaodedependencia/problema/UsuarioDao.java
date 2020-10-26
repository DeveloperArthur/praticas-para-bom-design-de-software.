package br.com.arthur.principles.SOLID.inversaodedependencia.problema;

public class UsuarioDao {

    public void cadastraUsuario() {
        System.out.println("insert into usuario");
    }

    public void deletaUsuario() {
        System.out.println("delete from usuario");
    }

    public void atualizaUsuario() {
        System.out.println("update from usuario");
    }

    public void buscaUsuario() {
        System.out.println("select * from usuario");
    }
}
