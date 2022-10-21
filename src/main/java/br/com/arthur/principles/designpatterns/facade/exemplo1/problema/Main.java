public class Main {
    public static void main(String[] args) {
        Conta minhaConta = repository.findById(1);
        Conta outraConta = repository.findById(2);

        //perceba a dificuldade de executar uma transferencia, somos o cliente da classe transferencia
        //mas veja que trabalho que da utilizar essa classe, e a ordem de execucao nao esta clara
        //a interface de uso da classe transferencia não é mto simples
        Transferencia transferencia = new Transferencia();
        transferencia.validarConta(minhaConta);
        transferencia.validarConta(outraConta);
        BigDecimal valorTransferencia = new BigDecimal("100");
        transferencia.checarSaldo(minhaConta, valorTransferencia);
        transferencia.executar(minhaConta, outraConta, valorTransferencia);
    }
}
