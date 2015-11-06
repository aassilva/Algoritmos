package br.ufg.es.construcao.algoritmo20;

/**
 * Classe que implementa a Razão-Áurea.
 */

public class Algoritmo20 {

    /**
     * Serviço que calcula a Razão-Áurea.
     * @param t1 entrada do primeiro numero.
     * @param t2 entrada do segundo numero.
     * @param fator Precisão do calculo.
     * @return número ouro (Resultado da Razão-Áurea).
     * @throws java.lang.IllegalArgumentException se o valor de t1, t2 ou fator for menor que 0.
     */

    public static double razaoAurea(int t1, int t2, int fator){
        if (t1 < 1 || t2 < t1 || fator < 1) {
            throw new IllegalArgumentException("t1, t2 ou fator invalido");
        }
        double tc = t2;
        double ta = t1;
        int i = 0;
        while ( i <= fator) {
            tc = tc + ta;
            ta = tc -ta;
            i = i + 1;
        }
        return tc/ta;
    }
}
