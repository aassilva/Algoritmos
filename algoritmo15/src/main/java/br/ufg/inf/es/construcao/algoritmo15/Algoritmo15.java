package br.ufg.inf.es.construcao.algoritmo15;

/**
 * Classe que implementa o pi.
 */

public class Algoritmo15 {

    /**
     * Serviço que calcular o valor de PI de uma somatória de termo.
     * @param n número de precisão do valor.
     * @throw IllegalArgumentException para n menor que 1.
     * @return valor de PI.
     */

    public static int pi(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        int s = -1;
        int d = -1;
        int p = 0;
        for (int i = 1; i <= n ; i++) {
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
        }

        return p;
    }
}
