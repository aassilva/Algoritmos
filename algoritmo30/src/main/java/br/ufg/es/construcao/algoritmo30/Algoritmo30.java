package br.ufg.es.construcao.algoritmo30;

/**
 * Classe que implementa o pol simples.
 */

public class Algoritmo30 {

    /**
     * Serviço que calcula polinomios.
     * @param x primeiro número inteiro.
     * @param g segundo número inteiro.
     * @param a vetor de números inteiros.
     * @throws IllegalArgumentException para g menor que 1 e vetor a com posição g igual a zero.
     * @return polinomio.
     */

    public static int polSimples(int x, int g, int[] a) {
        if ((g < 1) || (a[g] == 0)) {
            throw new IllegalArgumentException("g ou a invalido");
        }

        double t = Math.pow(x, g);
        double p = a[0];
        int i = 1;

        while (i <= g) {
            t = Math.pow(x, i);
            p = (p + a[i] * t);
            i += 1;
        }

        return (int) p;
    }
}