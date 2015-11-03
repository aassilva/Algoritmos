package br.ufg.inf.es.construcao.algoritmo13;

/**
 * Classe que implementa o Número-Harmônico.
 */

public class Algoritmo13 {

    /**
     * Serviço que calcula o Número-Harmônico.
     * @param n número inteiro.
     * @throws IllegalArgumentException para n menor que 1.
     * @return número harmônico.
     */

    public static double numeroHarmonico(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        double s = 1;
        for (int i = 2; i <= n ; i++) {
            s = s + 1 / i;
        }

        return s;
    }
}
