package br.ufg.es.construcao.algoritmo23;

/**
 * Classe que implementa a soma dos divisores.
 */

public class Algoritmo23 {

    /**
     * Serviço que calcula a soma dos divisores de um número.
     * @param n número inteiro.
     * @throws IllegalArgumentException para n menor que 1.
     * @return soma dos divisores de n.
     */

    public static int somaDivisores(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n invalido");
        }

        int d = 2;
        int s = 1;
        while (d <= (n / 2)) {
            if (n % d == 0) {
                s = s + d;
            }

            d = d + 1;
        }

        return s;
    }
}