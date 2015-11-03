package br.ufg.inf.es.construcao.algoritmo4;

/**
 * Classe que implementa produto entre dois números.
 */

public class Algoritmo4 {

    /**
     * Serviços que calcula o produto usando a soma.
     * @param a número inteiro.
     * @param b número inteiro.
     * @throws IllegalArgumentException para a ou b menor que 0.
     * @return produto dos números a e b.
     */

    public static int produto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a ou b inválido");
        }

        int s = 0;

        for (int i = 1; i <= b; i++){
            s += a;
        }

        return s;
    }
}