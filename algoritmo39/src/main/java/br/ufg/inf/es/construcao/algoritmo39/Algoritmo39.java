package br.ufg.inf.es.construcao.algoritmo39;

/**
 * Classe que implementa a propriedade.
 */

public class Algoritmo39 {

    /**
     * Serviço que verifica a propriedade.
     * @return a propriedade.
     */

    public static int propriedade() {
        int t = 0;
        int n = 0;
        while (n < 1000) {
            if (atendeSomaFatDigitos(n)) {
                t = t + 1;
            }

            n = n + 1;
        }

        return t;
    }

    /**
     * Serviço que verifica se um número e igual a soma de seu fatorial.
     * @param n número inteiro.
     * @return true se o número e igual a soma de seu fatorial ou false se não é.
     */

    public static boolean atendeSomaFatDigitos(int n) {
        int a = n / 100;
        int b = (n - 100 * a) / 10;
        int c = n % 10;
        int s = fatorial(a) + fatorial(b) + fatorial(c);

        return s == n;
    }

    /**
     * Serviço que calcula o fatorial de um número.
     * @param n número inteiro.
     * @return fatorial de n.
     */

    public static int fatorial(int n) {
        int f = 1;
        for (int i = 2; i <= n ; i++) {
            f = f * i;
        }

        return f;
    }
}
