package br.ufg.inf.es.construcao.algoritmo34;

/**
 * Classe que implementa o cpf.
 */

public class Algoritmo34 {

    /**
     * Serviço que verifica a validade do cpf.
     * @param d vetor com númeor do cpf.
     * @throws IllegalArgumentException para a.length maior que 11 ou menor que 11.
     * @return True se cpf valido e False pra cpf invalido.
     */

    public static boolean Cpf(int []d) {
        if (d.length < 12 || d.length > 12) {
            throw new IllegalArgumentException("d invalido");
        }

        int c = 8;
        int p = d[9];
        int s = d[9];
        while (c >= 1) {
            p = p + d[c];
            s = s + p;
            c = c - 1;
        }

        int j = ((s % 11) % 10);
        int k = (((s - p + (9 * j)) % 11) % 10);

        return (j == d [10] && k == d[11]);
    }
}
