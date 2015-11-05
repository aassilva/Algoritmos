package br.ufg.inf.es.construcao.algoritmo18;

/**
 * Classe que implementa o Log Natural Simples.
 */

public class Algoritmo18 {

    /**
     * Serviço que calcula o fatorial de x.
     * @param x assume o valor de i ao chamar o método fatorial.
     * @return o fatorial.
     */

    public static int fatorial(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) {
            f = f * i;
        }

        return f;
    }

    /**
     * Serviço que calcula a potência.
     * @param x base da potência.
     * @param y expoente da potência.
     * @return potência.
     */

    public static int potencia(int x, int y) {
        return (int) Math.pow(x,y);
    }

    /**
     * Serviço que calcula o Log Natural Simples.
     * @param n primeiro número inteiro.
     * @param k segundo número inteiro.
     * @throws IllegalArgumentException para n menor que 1 e para k menor que 2.
     * @return  Log Natural Simples.
     */

    public static int logNaturalSimples(int n, int k) {
        if ((n < 1) || (k < 2)) {
            throw new IllegalArgumentException("n ou k invalido");
        }

        int e = n + 1;
        for (int i = 2; i <= k ; i++) {
            int p = potencia(n, i);
            int f = fatorial(i);
            e = e + p / f;
        }

        return e;
    }
}