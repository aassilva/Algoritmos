package br.ufg.inf.es.construcao.algoritmo31;

/**
 * Classe que implementa Pol-Horner.
 */

public class Algoritmo31 {

    /**
     *Servi�o que calcula a raiz de um polin�mio.
     * @param x primeiro n�mero inteiro.
     * @param g segundo n�mero inteiro.
     * @param a vetor de n�meros inteiros.
     * @throws IllegalArgumentException para g menor que 1.
     * @return raiz do polin�mio.
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

