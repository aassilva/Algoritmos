package br.ufg.inf.es.construcao.algoritmo9;

/**
 * Classe para implementação de um número primo.
 */

public class Algoritmo9 {

    /**
     * Serviço que verificar se um numero é primo.
     * @param n número de entrada.
     * @throws IllegalArgumentException  para n menor que 2.
     * @return true para número primo e false para número não-primo.
     */

    public static boolean primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("n inválido");
        }

        for (int i = 2; i <= (n - 1); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}