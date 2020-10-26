package br.com.arthur.principles.SOLID.inversaodedependencia.solucao;

public class UsuarioDao implements UsuarioDaoInterface {

    @Override
    public void cadastraUsuario() {
        System.out.println("insert into usuario");
    }

    @Override
    public void deletaUsuario() {
        System.out.println("delete from usuario");
    }

    @Override
    public void atualizaUsuario() {
        System.out.println("update from usuario");
    }

    @Override
    public void buscaUsuario() {
        System.out.println("select * from usuario");
    }
}
