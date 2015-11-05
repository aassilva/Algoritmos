package br.ufg.inf.es.construcao.algoritmo19;

/**
 * Classe que implementa o Logn.
 */

public class Algoritmo19 {

    /**
     *Serviço que calcula o Logn.
     * @param n primeiro número inteiro.
     * @param k segundo número inteiro.
     * @throws IllegalArgumentException para n menor que 1 e para k menor que 2.
     * @return Logn.
     */

    public static double logn(int n, int k) {
        if ((n < 1) || (k < 2)) {
            throw new IllegalArgumentException("n ou k invalido");
        }

        double e = n + 1;
        double t = n;
        for (int i = 2; i <= k ; i++) {
            t = t * n / i;
            e = e + t;
        }

        return e;
    }
}

