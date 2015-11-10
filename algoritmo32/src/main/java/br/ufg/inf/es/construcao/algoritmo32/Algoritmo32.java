package br.ufg.inf.es.construcao.algoritmo32;

/**
 * Classe que implementa a sequ�ncia de fibonacci.
 */

public class Algoritmo32 {

    /**
     * Servi�o que calcula a sequ�ncia de fibonacci.
     * @param n n�mero inteiro.
     * @throws IllegalArgumentException para n menor que 0.
     * @return soma da sequ�ncia de fibonacci.
     */

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido");
        }

        if (n == 0 || n == 1) {

            return n;
        }

        int a = 0;
        int c = 1;
        for (int i = 2; i <= n; i++) {
            int t = c;
            c = c + a;
            a = t;
        }

        return c;
    }
}