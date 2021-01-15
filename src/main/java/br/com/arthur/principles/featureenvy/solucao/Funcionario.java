package br.com.arthur.principles.featureenvy.solucao;

public class Funcionario {
    int decimaTaxa = 0;
    int decimosTrabalhados = 0;
    int vezesConsecutivas = 0;

    public Double calculaPagamentoSemanal() {
        int decimaTaxa = this.decimaTaxa;
        int decimosTrabalhados = this.decimosTrabalhados;
        int vezesConsecutivas = this.vezesConsecutivas;
        int horaExtra = vezesConsecutivas * decimaTaxa;
        int pagamentoDireto = horaExtra + decimosTrabalhados * 2;
        int pagamentoDeHoraExtra = pagamentoDireto + horaExtra;
        return (double) (pagamentoDeHoraExtra * 20);
    }
}
