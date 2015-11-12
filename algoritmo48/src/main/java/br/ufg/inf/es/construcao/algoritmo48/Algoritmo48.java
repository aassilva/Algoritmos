package br.ufg.inf.es.construcao.algoritmo48;

/**
 * Classe que implementa o buble sort.
 */

public class Algoritmo48 {

    /**
     * Serviço que organiza um vetor.
     * @throws IllegalArgumentException para n menor que 1.
     * @param a vetor de numeros inteiros.
     * @param n tamanho do vetor.
     */

    public static void bubleSort(int []a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido");
        }

        int p = n;
        while (p >= 1) {
            int i = 1;
            while (i < p - 1) {
                if (a[i] < a[i + 1]) {
                    int t = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = t;
                }

                i = i + 1;
            }

            p = p - 1;
        }
    }
}