/*
* Repare que a partir deste momento, a classe usuarioController DEPENDE da classe usuarioDao
* No principio de inversao de dependencia nao podemos deixar isso acontecer
* porque se a usuariodao parar de funcionar, a usuariocontroller tambem para...
* devemos nos acoplar com interfaces, pois sao instaveis
* */

package br.com.arthur.principles.SOLID.inversaodedependencia.problema;

public class UsuarioController {
    UsuarioDao usuarioDao = new UsuarioDao();

    public void cadastraUsuario() {
        usuarioDao.cadastraUsuario();
    }
}
