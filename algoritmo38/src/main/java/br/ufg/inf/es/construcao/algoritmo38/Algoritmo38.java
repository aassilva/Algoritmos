package br.ufg.inf.es.construcao.algoritmo38;

/**
 * Classe que implementa a hipotenusa.
 */

public class Algoritmo38 {

    /**
     * Serviso que calcula o lado mais logo de um tri�ngulo.
     * @param a primeiro n�mero inteiro(cateto).
     * @param b segundo n�mero inteiro(cateto).
     * @return comprimento da hipotenusa
     */

    public static int hipotenusa(int a, int b) {
        int x = a * a;
        int y = b * b;

        return (int) Math.sqrt(x + y);
    }
}
