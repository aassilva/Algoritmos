package br.ufg.inf.es.construcao.algoritmo37;

/**
 * Classe que implementa a função ackerman.
 */

public class Algoritmo37 {

    /**
     * Serviço que verifica o algoritmo de ackerman.
     * @param x primeiro número inteiro.
     * @param y segundo número inteiro.
     * @throws IllegalArgumentException para x ou y menor que 0.
     * @return função ackerman.
     */

    public static int ackerman(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        if (x == 0) {
            return y + 1;
        }

        if (y == 0) {
            return ackerman(x - 1, 1);
        }

        return ackerman(x - 1, ackerman(x, y - 1));
    }
}
