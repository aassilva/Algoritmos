package br.ufg.inf.es.construcao.algoritmo45;

/**
 * Classe que implementa o imprime array..
 */

public class Algoritmo45 {

    /**
     * Serviço que imprime um vetor.
     * @throws IllegalArgumentException para n menor que 0.
     * @param a vetor de numero inteiro.
     * @param n tamanho do vetor.
     */

    public static void imprimeArray(int []a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido");
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
    }
}
