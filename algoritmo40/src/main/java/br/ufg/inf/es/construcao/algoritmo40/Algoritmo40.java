package br.ufg.inf.es.construcao.algoritmo40;

/**
 * Classe que implementa atende soma fatorial digitos.
 */

public class Algoritmo40 {

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
