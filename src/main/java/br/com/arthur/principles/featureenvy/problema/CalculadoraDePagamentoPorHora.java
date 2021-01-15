/* Observe, o método calculaPagamentoSemanal consulta o objeto
 * Funcionario pra obter os dados que ele opera, não seria mais facil
 * ao inves disso, criar uma classe em Funcionario, pra ele mesmo retornar
 * o pagamento semanal? Este cenário é chamado de inveja de funcionalidade*/

package br.com.arthur.principles.featureenvy.problema;

public class CalculadoraDePagamentoPorHora {
    public Double calculaPagamentoSemanal(Funcionario funcionario) {
        int decimaTaxa = funcionario.getDecimaTaxa();
        int decimosTrabalhados = funcionario.getDecimosTrabalhados();
        int vezesConsecutivas = funcionario.getVezesConsecutivas();
        int horaExtra = vezesConsecutivas * decimaTaxa;
        int pagamentoDireto = horaExtra + decimosTrabalhados * 2;
        int pagamentoDeHoraExtra = pagamentoDireto + horaExtra;
        return (double) (pagamentoDeHoraExtra * 20);
    }
}
