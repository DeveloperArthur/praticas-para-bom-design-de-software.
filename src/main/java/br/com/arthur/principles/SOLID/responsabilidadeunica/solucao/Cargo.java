package br.com.arthur.principles.SOLID.responsabilidadeunica.solucao;

public enum Cargo {
    DESENVOLVEDOR(new DezPorcento()),
    TESTER(new VintePorcento()),
    SUPORTE(new TrintaPorcento());

    private RegraDeSalario regraDeSalario;

    Cargo(RegraDeSalario regraDeSalario) {
        this.regraDeSalario = regraDeSalario;
    }

    public RegraDeSalario getRegraDeSalario() {
        return regraDeSalario;
    }
}
