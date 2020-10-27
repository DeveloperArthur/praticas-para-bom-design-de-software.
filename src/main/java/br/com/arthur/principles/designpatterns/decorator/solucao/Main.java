package br.com.arthur.principles.designpatterns.decorator.solucao;

public class Main {
    public static void main(String[] args) {
        Imposto iss = new ISS();
        Imposto issComIcpp = new ISS(new ICPP());
        Imposto icppComIcmsComIss = new ICPP(new ICMS(new ISS()));

        montaResultadoNaTela(iss, issComIcpp, icppComIcmsComIss);
    }

    private static void montaResultadoNaTela(Imposto iss, Imposto issComIcpp, Imposto icppComIcmsComIss) {
        System.out.println(iss.calcula());
        System.out.println(issComIcpp.calcula());
        System.out.println(icppComIcmsComIss.calcula());
    }
}
