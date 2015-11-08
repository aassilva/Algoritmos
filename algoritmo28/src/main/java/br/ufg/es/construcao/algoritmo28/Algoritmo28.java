package br.ufg.es.construcao.algoritmo28;

/**
 * Classe que implementa a divis�o.
 */

public class Algoritmo28 {

    /**
     * Servi�o que calcula a divis�o ultilizando o produto e o resto.
     * @param a n�mero dividendo.
     * @param b n�mero divisor.
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
     * Servi�o que calcula quantas vezes um n�mero y pode ser somado a ele mesmo at� chegar o valor de x.
     * @param x primeiro n�mero inteiro.
     * @param y segundo n�mero inteiro.
     * @return quantas vezes o n�mero y foi somado a ele mesmo para chegar em x.
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
     * Servi�os que calcula o produto usando a soma.
     * @param a n�mero inteiro.
     * @param b n�mero inteiro.
     * @return produto dos n�meros a e b.
     */

    public static int produto(int a, int b) {
        int s = 0;
        for (int i = 1; i <= b; i++){
            s += a;
        }

        return s;
    }
}
