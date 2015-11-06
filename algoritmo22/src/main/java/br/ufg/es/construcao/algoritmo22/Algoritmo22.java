package br.ufg.es.construcao.algoritmo22;

/**
 * Classe que implementa amigos.
 */

public class Algoritmo22 {

    /**
     * Serviço que verifica se n é igual a soma dos divisores de m e se m é igual a soma dos divisores de n.
     * @param n primeiro número inteiro.
     * @param m segundo número inteiro.
     * @throws IllegalArgumentException para n ou m nemor que 0.
     * @return true se n é igual a soma dos divisores de m e se m é igual a soma dos divisores de n e false se não.
     */

    public static boolean amigos(int n, int m){
        if ((n < 1) || (m < 1)) {
            throw new IllegalArgumentException("n ou m invalido");
        }

        int sn = somaDivisores(n);
        int sm = somaDivisores(m);

        return sn == m && sm == n;
    }

    /**
     * Serviço que calcular a soma dos divisores de um número.
     * @param n número inteiro.
     * @return a soma dos divisores de n.
     */

    public static int somaDivisores(int n) {
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