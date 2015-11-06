package br.ufg.es.construcao.algoritmo29;

/**
 * Classe que implementa a raiz quadrada.
 */

public class Algoritmo29 {

    /**
     * Serviço que calcula a raiz de um número.
     * @param n primeiro número inteiro.
     * @param i segundo número inteiro.
     * @throws IllegalArgumentException para n menor que 1.
     * @return Raiz do número.
     */

    public static int raizQuadrada(int n, int i){
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        int r = 1;
        while (i >= 0) {
            r = (r + n / r) / 2;
            i = i - 1;
        }

        return r;
    }
}
