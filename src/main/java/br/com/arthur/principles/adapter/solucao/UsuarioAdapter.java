package br.com.arthur.principles.designpatterns.adapter.solucao;

public class UsuarioAdapter implements UsuarioInterface {
    UsuarioJDBC usuarioJDBC = new UsuarioJDBC();

    @Override
    public void salva() {
        usuarioJDBC.salvaUsuario();
    }

    @Override
    public void deleta() {
        usuarioJDBC.deletaUsuario();
    }

    @Override
    public void busca() {
        usuarioJDBC.buscaUsuario();
    }

    @Override
    public void atualiza() {
        usuarioJDBC.atualizaUsuario();
    }
}
