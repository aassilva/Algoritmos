package br.ufg.es.construcao.algoritmo26;

/**
 * Classe que implementa Mod Simples.
 */

public class Algoritmo26 {

    /**
     * Serviço que calcula o Mod Simples.
     * @param x primeiro número inteiro.
     * @param y segundo número inteiro.
     * @throws IllegalArgumentException para x ou y menor que 0.
     * @return Mod Simples.
     */

    public static int modSimples(int x, int y){
        if (x < 1 || y < 1) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        int d = divideSubtracoes(x, y);

        return x - (d * y);
    }

    /**
     * Serviço que calcula quantas vezes um número x foi decrementado por y para chegar há y.
     * @param x primeiro número inteiro.
     * @param y segundo número inteiro.
     * @return quantas vezes o número x foi decrementado por y.
     */

    public static int divideSubtracoes(int x, int y) {
        int d = 0;
        int s = x;
        while (s >= y) {
            s = s - y;
            d = d + 1;
        }

        return d;
    }
}