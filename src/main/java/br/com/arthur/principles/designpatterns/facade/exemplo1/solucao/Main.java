public class Main {
    public static void main(String[] args) {
        Conta minhaConta = repository.findById(1);
        Conta outraConta = repository.findById(2);

        //este metodo executa esta atuando como uma fachada
        //esta escondendo esses detalhes internos
        Transferencia transferencia = new Transferencia();
        transferencia.executar(minhaConta, outraConta, valorTransferencia);
    }
}