package br.ufg.es.construcao.algoritmo28;

/**
 * Classe que implementa a divisão.
 */

public class Algoritmo28 {

    /**
     * Serviço que calcula a divisão ultilizando o produto e o resto.
     * @param a número dividendo.
     * @param b número divisor.
     * @param k quantidade de casas decimais.
     * Imprime o quociente.
     */

    public static void divide(int a, int b, int k) {
        int d = divideSomas(a, b);
        System.out.print(d);
        int r =a % b;
        if (r != 0) {
            System.out.print(",");
        }

        while (r != 0 && k > 0) {
            r = produto(10, r);
            d = divideSomas(r, b);
            System.out.print(d);
            r = (r % b);
            k = k - 1;
        }
    }

    /**
     * Serviço que calcula quantas vezes um número y pode ser somado a ele mesmo até chegar o valor de x.
     * @param x primeiro número inteiro.
     * @param y segundo número inteiro.
     * @return quantas vezes o número y foi somado a ele mesmo para chegar em x.
     */

    public static int divideSomas(int x, int y) {
        int d = 0;
        int s = y;
        while (s <= x) {
            s = s + y;
            d = d + 1;
        }

        return d;
    }

    /**
     * Serviços que calcula o produto usando a soma.
     * @param a número inteiro.
     * @param b número inteiro.
     * @return produto dos números a e b.
     */

    public static int produto(int a, int b) {
        int s = 0;
        for (int i = 1; i <= b; i++){
            s += a;
        }

        return s;
    }
}
