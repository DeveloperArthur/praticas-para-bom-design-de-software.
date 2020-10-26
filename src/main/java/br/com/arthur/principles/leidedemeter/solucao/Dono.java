package br.com.arthur.principles.leidedemeter.solucao;

import br.com.arthur.principles.leidedemeter.Cachorro;

public class Dono {
    private Cachorro cachorro;

    public Cachorro getCachorro() {
        return cachorro;
    }

    public String getNomeDoCachorro() {
        return cachorro.getNome();
    }
}
