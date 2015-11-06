package br.ufg.es.construcao.algoritmo21;

/**
 * Classe que implementa o Quadrado Perfeito.
 */

public class Algoritmo21 {

    /**
     * Serviço que verifica se um número é um quadrado perfeito.
     * @param k número a ser verificado.
     * @throws IllegalArgumentException para k menor que 1.
     * @return true se o número for quadrado perfeito e false se não.
     */

    public static boolean quadradoPerfeito(int k){
        if (k < 1) {
            throw new IllegalArgumentException("k invalido");
        }

        int i = 1;
        int q = 1;
        while (q < k){
            i = i + 2;
            q = q + i;
        }

        return q == k;
    }
}
