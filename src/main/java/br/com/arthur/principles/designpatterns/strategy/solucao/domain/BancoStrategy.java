package br.com.arthur.principles.designpatterns.strategy.solucao;

//Toda vez que criar um banco novo, terá que 
//implementar essa interface e criar um novo tipo no enum TiposDeBancos
public interface BancoStrategy {
    double calcula(Pagamento pagamento);

    /*static BancoStrategy cria(String banco){
        BancoStrategy banco;
        if ("Itau".equals(banco)) {
            banco = new Itau();
        } else if ("Nubank".equals(banco)) {
            banco = new Nubank();
        } else if ("Santander".equals(banco)) {
            banco = new Santander();
        } else {
            throw new IllegalArgumentException("Banco inválido: " + banco);
        }
        return geradorEbook;
    }*/

    static BancoStrategy cria(TiposDeBancos banco){
        return banco.getBanco();
    }
}
