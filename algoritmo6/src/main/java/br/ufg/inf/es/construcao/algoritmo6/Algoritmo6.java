package br.ufg.inf.es.construcao.algoritmo6;

/**
 * Classe que implementa potência-soma.
 */

public class Algoritmo6 {

    /**
     * Serviço que calcula o produto.
     * @param a assume o valor de p ao chamar a método produto.
     * @param b assume o valor de de x ao chamar a método produto.
     * @return produto de a e b.
     */

    public static int produto(int a, int b) {
        int s = 0;

        for (int i = 1; i <= b; i++) {
            s += a;
        }

        return s;
    }

    /**
     * Serviço que calcula a potência-soma.
     * @param x primeiro número de entrada.
     * @param y segundo número de entrada.
     * @throws IllegalArgumentException para x e y menor que 0.
     * @return soma do produto de x.
     */

    public static int potenciaSoma(int x, int y) {
        if (x < 1 || y < 1) {
            throw new IllegalArgumentException("a ou b inválido");
        }

        int p = x;

        for (int i = 1; i < y; i++) {
            p = produto(p, x);
        }

        return p;
    }
}