package br.ufg.inf.es.construcao.algoritmo10;

/**
 * Classe que implementa o Crivo-Eratóstenes
 */

public class Algoritmo10 {

    /**
     * Serviço para verificar o Crivo-Eratóstenes.
     * @param a vetor.
     * @param n número inteiro.
     * @throws IllegalArgumentException para n menor que 2.
     * @throws IllegalArgumentException para vetor com tamanho menor que n + 1.
     * @throws IllegalArgumentException para vetor com valor diferente de 0 a partir da posição 2 inclusive.
     */

    public static void crivoEratostenes(int[] a, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n invalido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("tamanho vetor invalido");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("preenchimento invalido");
            }
        }

        int i = 2;
        int c = 0;
        while (i <= n / 2) {
            if (a[i] == 0) {
                c = i + i;

                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
            }

            i += 1;
        }
    }
}
