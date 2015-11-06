package br.ufg.es.construcao.algoritmo27;

/**
 * Classe que implementa o Mod.
 */

public class Algoritmo27 {

    /**
     * Serviço que calcula o Mod.
     * @param x primeiro número inteiro.
     * @param y segundo número inteiro.
     * @throws IllegalArgumentException para x menor que 1 ou y menor que 0.
     * @return Mod.
     */

    public static int mod(int x, int y){
        if (x < 1 || y < 0) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        int s = x;
        while (s >= y) {
            s = s - y;
        }

        return s;
    }
}