package br.ufg.es.construcao.algoritmo24;

/**
 * Classe que implementa Divide Somas.
 */

public class Algoritmo24 {

    /**
     * Serviço que calcula quantas vezes um número y pode ser somado a ele mesmo até chegar o valor de x.
     * @param x primeiro número inteiro.
     * @param y segundo número inteiro.
     * @throws IllegalArgumentException para x menor que 0 e y menor que 1.
     * @return quantas vezes o número y foi somado a ele mesmo para chegar em x.
     */

    public static int divideSomas(int x, int y) {
        if (x < 0 || y < 1) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        int d = 0;
        int s = y;
        while (s <= x) {
            s = s + y;
            d = d + 1;
        }

        return d;
    }
}
