package br.ufg.es.construcao.algoritmo25;

/**
 * Classe que implementa Divide Subtrações.
 */

public class Algoritmo25 {

    /**
     * Serviço que calcula quantas vezes um número x foi decrementado por y para chegar há y.
     * @param x primeiro número inteiro.
     * @param y segundo número inteiro.
     * @throws IllegalArgumentException para x menor que 0 e y menor que 1.
     * @return quantas vezes o número x foi decrementado por y.
     */

    public static int divideSubtracoes(int x, int y) {
        if (x < 0 || y < 1) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        int d = 0;
        int s = x;
        while (s >= y) {
            s = s - y;
            d = d + 1;
        }

        return d;
    }
}
