package br.ufg.inf.es.construcao.algoritmo8;

/**
 * Classe para implementação da propriedade 153;
 */

public class Algoritmo8 {

    /**
     * Serviço que verificar se um número possui a propriendade 153.
     * @param n número que deseja verificar.
     * @throws IllegalArgumentException para n menor que 0 ou maior que 999.
     * @return true se o número possui a propriedade 153, ou false se não possui.
     */

    public static boolean propriedade153(int n) {
        if ((n < 0) || (n > 999)) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = n / 100;
        int j = (n - 100 * i) / 10;
        int k = n % 10;

        return ((i * i * i) + (j * j * j) + (k * k * k)) == n;
    }
}

