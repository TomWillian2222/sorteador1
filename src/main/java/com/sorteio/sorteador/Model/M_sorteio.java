package com.sorteio.sorteador.Model;

public class M_sorteio {

    public int minimo;
    public int maximo;
    public int quantidade;

    public M_sorteio(int minimo, int maximo, int quantidade) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.quantidade = quantidade;
    }
    public int getMinimo() {
        return minimo;
    }
    public int getMaximo() {
        return maximo;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
