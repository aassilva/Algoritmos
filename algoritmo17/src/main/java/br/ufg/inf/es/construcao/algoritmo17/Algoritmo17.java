package br.ufg.inf.es.construcao.algoritmo17;

/**
 * Classe que implementa o fatorial soma.
 */

public class Algoritmo17 {

    /**
     * Serviço que calcula o produto.
     * @param a assume o valor de f quando é chamada a método produto.
     * @param b assume o valor de i quando é chamada a método produto.
     * @return o produto.
     */

    public static int produto(int a, int b) {
        int s = 0;

        for (int i = 1; i <= b; i++){
            s += a;
        }

        return s;
    }

    /**
     * Serviço que calcula o fatorial soma.
     * @param n número inteiro.
     * @throws IllegalArgumentException para n menor que 1.
     * @return fatorial de dois números.
     */

    public static int fatorialSoma(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        int f = 1;
        for (int i = 2; i <= n ; i++) {
            f = produto(f, i);
        }

        return f;
    }
}
