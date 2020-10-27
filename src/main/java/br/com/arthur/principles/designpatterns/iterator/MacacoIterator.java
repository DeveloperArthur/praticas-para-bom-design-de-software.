package br.com.arthur.principles.designpatterns.iterator;

public class MacacoIterator implements Iterator {
    Macaco[] macacos;
    int posicao = 0;

    public MacacoIterator(Macaco[] macacos) {
        this.macacos = macacos;
    }

    @Override
    public Object next() {
        Macaco macaco = macacos[posicao];
        posicao++;
        return macaco;
    }

    @Override
    public boolean hasNext() {
        if (posicao >= macacos.length || macacos[posicao] == null)
            return false;
        return true;
    }
}
