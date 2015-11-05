package br.ufg.inf.es.construcao.algoritmo14;

/**
 * Classe que implementa a somatória.
 */

public class Algoritmo14 {

    /**
     * Serviço que calcula a soma de um grande número de termo.
     * @param n múmero inteiro.
     * @throws IllegalArgumentException para n menor que 1.
     * @return soma do termo.
     */

    public static int somatoria(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        int s = 0;
        for (int i = 1; i <= n ; i++) {
            int d = 1 + (i * i);
            s = s + 1 / d;
        }

        return s;
    }
}