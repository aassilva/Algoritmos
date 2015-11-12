package br.ufg.inf.es.construcao.algoritmo47;

/**
 * Classe que implementa a media array.
 */

public class Algoritmo47 {

    /**
     * Serviço que calcula a media de um vetor.
     * @throws IllegalArgumentException para n menor que 0.
     * @param a vetor de numero inteiro.
     * @param n tamanho do vetor.
     * @return media do vetor.
     */

    public static int mediaArray(int []a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido");
        }

        int s = somaArray(a, n);

        return (int)s / n;
    }

    /**
     * Serviço que calcula a soma de um vetor.
     * @param a vetor de número inteiro.
     * @param n tamanho do vetor.
     * @return soma do vetor.
     */

    public static int somaArray(int []a, int n) {
        int s = 0;
        int i = 1;
        while (i <= n) {
            s += a[i];
            i ++;
        }

        return s;
    }

}