package br.ufg.inf.es.construcao.algoritmo46;

/**
 * Classe que implementa a soma Array.
 */

public class Algoritmo46 {

    /**
     * Servi�o que soma os elementos de um vetor.
     * @param a vetor de n�meros inteiros.
     * @param n posi��o final da soma do vetor
     * @throws IllegalArgumentException para n menor que 0.
     * @return soma dos elementos do vetor at� posi��o n.
     */

    public static int somaArray(int []a, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido");
        }

        int s = 0;
        int i = 0;
        while (i <= n) {
            s = s + a[i];
            i = i + 1;
        }

        return s;
    }
}
