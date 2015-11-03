package br.ufg.inf.es.construcao.algoritmo11;

/**
 * Classe que implementa o MDC.
 */

public class Algoritmo11 {

    /**
     * Serviço que calcula o MDC.
     * @param a primeiro número.
     * @param b segundo número.
     * @throws IllegalArgumentException para a menor que b e b menor que 1.
     * @return O maximo divisor comum entre dois números.
     */

    public static int mdc(int a, int b) {
        if (a < b && b < 1) {
            throw new IllegalArgumentException("a ou b invalido");
        }

        while (b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}