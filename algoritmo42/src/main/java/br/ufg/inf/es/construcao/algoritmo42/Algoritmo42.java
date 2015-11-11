package br.ufg.inf.es.construcao.algoritmo42;

/**
 * Classe que implementa a soma dos naturais.
 */

public class Algoritmo42 {

    /**
     * Servi�o que calcula a soma dos n�meros naturais.
     * @param n n�mero inteiro.
     * @throws IllegalArgumentException para n menor que 1.
     * @return soma dos naturais at� n.
     */

    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        if (n == 1) {

            return 1;
        }

        return somaNaturais(n - 1) + n;
    }
}
