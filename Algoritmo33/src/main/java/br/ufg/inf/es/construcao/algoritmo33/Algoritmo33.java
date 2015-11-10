package br.ufg.inf.es.construcao.algoritmo33;

/**
 * Classe que implementa o cpf.
 */

public class Algoritmo33 {

    /**
     * Serviço que verifica a validade do cpf.
     * @param d vetor com númeor do cpf.
     * @throws IllegalArgumentException para a.length maior que 11 ou menor que 11.
     * @return false se cpf valido e true pra cpf invalido.
     */

    public static boolean Cpf(int []d) {
        if (d.length < 11 || d.length > 11) {
            throw new IllegalArgumentException("d invalido");
        }

        int sj = 0;
        int sk = 0;
        for (int i = 0; i <= 8; i++) {
            sj = sj + d[i];
            sk = sk + d[i + 1];
        }

        int j = ((sj % 11) % 10);
        int k = ((sk % 11) % 10);

        return ((j == d[9]) && (k == d[10]));
    }
}
