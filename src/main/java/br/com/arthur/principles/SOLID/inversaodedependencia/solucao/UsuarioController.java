/*
Pronto, agora está certo! Estamos dependendo de interfaces!
 * */

package br.com.arthur.principles.SOLID.inversaodedependencia.solucao;

public class UsuarioController {
    UsuarioDaoInterface daoInterface = new UsuarioDao();

    public void cadastraUsuario() {
        daoInterface.cadastraUsuario();
    }
}
