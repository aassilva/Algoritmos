package br.ufg.inf.es.construcao.algoritmo31;

/**
 * Classe que implementa Pol-Horner.
 */

public class Algoritmo31 {

    /**
     *Serviço que calcula a raiz de um polinômio.
     * @param x primeiro número inteiro.
     * @param g segundo número inteiro.
     * @param a vetor de números inteiros.
     * @throws IllegalArgumentException para g menor que 1.
     * @return raiz do polinômio.
     */

    public static int polHorner(int x, int g, int []a){
        if (g < 1){
            throw new IllegalArgumentException("g invalido.");
        }

        int p = a[g];
        for (int i = g - 1; i >= 0; i--){
            p = p * x + a[i];
        }

        return p;
    }
}

