package br.ufg.inf.es.construcao.algoritmo3;

/**
 * Classe que implementa a soma dos números naturais.
 */

public class Algoritmo3 {

    /**
     * Soma dos números naturais.
     * @param n entrada número inteiro.
     * @throws n menor que 1.
     * @return Soma dos numeros naturais até n.
     */

    public static int somaNaturais (int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n invalido!");
        }

        int s = 1;

        for (int i = 2; i <= n; i ++) {
            s += i;
        }

        return s;
    }
}
git 