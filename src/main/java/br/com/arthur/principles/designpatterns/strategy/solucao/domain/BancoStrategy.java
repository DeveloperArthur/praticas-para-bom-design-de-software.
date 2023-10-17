package br.com.arthur.principles.designpatterns.strategy.solucao;

//Toda vez que criar um banco novo, terá que 
//implementar essa interface e criar um novo tipo no enum TiposDeBancos
public interface BancoStrategy {
    double calcula(Pagamento pagamento);
}
