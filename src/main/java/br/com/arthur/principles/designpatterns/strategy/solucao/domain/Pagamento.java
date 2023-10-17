package br.com.arthur.principles.designpatterns.strategy.solucao;

public class Pagamento {
  private String bancoUtilizadoNaCompra;

  public String getBancoUtilizadoNaCompra() {
    return bancoUtilizadoNaCompra;
  }

  public void setBancoUtilizadoNaCompra(String bancoUtilizadoNaCompra) {
    this.bancoUtilizadoNaCompra = bancoUtilizadoNaCompra;
  }

  //pattern Active Record
  public static Pagamento query(String query) {
    String url = "jdbc:mysql://seu_servidor:porta/seu_banco_de_dados";
    String usuario = "seu_usuario";
    String senha = "sua_senha";

    Connection connection = DriverManager.getConnection(url, usuario, senha);
    PreparedStatement statement = connection.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    String bancoUtilizado = resultSet.getString("banco_utilizado");
    Pagamento pagamento = new Pagamento(bancoUtilizado);

    return pagamento;
  }
}
