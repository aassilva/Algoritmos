package br.ufg.inf.es.construcao.algoritmo5;

/**
 * Classe que implementa potência.
 */

public class Algoritmo5 {

    /**
     * Serviço que calcula potência .
     * @param x número inteiro (base).
     * @param y número inteiro (expoente).
     * @throws IllegalArgumentException para x ou y menor que 0.
     * @return potência.
     */

    public static int potencia(int x, int y){
        if  (x < 1 || y <0){
            throw new IllegalArgumentException(" x ou y invalido");
        }

        int p = 1;

        for (int i = 1; i <= y; i++){
            p = p * x;
        }

        return p;
    }
}