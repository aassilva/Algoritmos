package br.ufg.inf.es.construcao.algoritmo16;

/**
 * Classe que implementa o fatorial.
 */

public class Algoritmo16 {

    /**
     *Serviço que calcula o fatorial.
     * @param n número inteiro.
     * @throws IllegalArgumentException para n menor que 1.
     * @return fatorial.
     */

    public static int fatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        int f = 1;
        for (int i = 2; i <= n ; i++) {
            f = f * i;
        }

        return f;
    }
}