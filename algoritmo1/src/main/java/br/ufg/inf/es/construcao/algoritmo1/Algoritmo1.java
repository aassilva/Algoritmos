package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Classe que implementa o dia da semana.
 */

public class Algoritmo1 {

    /**
     * Serviço que identifica o dia da semana da data fornecida.
     * @param d dia do mês.
     * @param m mês do ano.
     * @param a  ano.
     * @throws java.lang.IllegalArgumentException se n menor que 1 ou maoir que 31.
     * @throws java.lang.IllegalArgumentException se m menor que 1 ou maior que 12.
     * @throws java.lang.IllegalArgumentException se a menor que 1753.
     * @return 0 para segunda-feira; 1 para terça-feira; ...; 6 para domingo.
     */

    public static int diaSemana(int d, int m, int a) {
        if (((d < 1) || (d > 31)) || ((m < 1) || (m > 12)) || (a < 1753)) {
            throw new IllegalArgumentException("d , m ou a invalido!");
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        fg

        return s % 7;
    }
}
