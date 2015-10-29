package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Classe que implementa o dia da semana.
 */

public class Algoritmo1 {

    /**
     * Implementação do dia da semana.
     * @param d entrada dia.
     * @param m entrada mês.
     * @param a entrada ano.
     * @throws d menor que 1 ou maoir que 31.
     * @throws m menor que 1 ou maior que 12.
     * @throws a menor que 1753.
     * @return saída o dia da semana. 0 para Segunda-feira; 1 para Terça-Feira; ...; 6 para Domingo.
     */

    public static int diaSemana(int d, int m, int a) {
        if (((d < 1) || (d > 31)) || ((m < 1) || (m > 12)) || (a < 1753)) {
            throw new IllegalArgumentException("d , m ou a invalido!");
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;

        return s % 7;
    }
}
