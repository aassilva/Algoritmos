package br.ufg.inf.es.construcao.algoritmo33;

/**
 * Classe que implementa o cpf.
 */

public class Algoritmo33 {

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

        int sj = 0;
        int sk = 0;
        for (int i = 1; i <= 9; i++) {
            sj = sj + i * d[i];
            sk = sk + i * d[i + 1];
        }

        int j = ((sj % 11) % 10);
        int k = ((sk % 11) % 10);

        return (j == d[10] && k == d[11]);
    }
}
