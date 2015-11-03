package br.ufg.inf.es.construcao.algoritmo7;

/**
 * Classe que implementa a propriedade 3025.
 */

public class Algoritmo7 {

    /**
     * serviço que verifica se um número dividido por 100, a soma dos dois números mais significativos,
     * com a soma dos dois numeros menos significativos elevado ao quadrado retorna ele mesmo.
     * @param n número que deseja verificar.
     * @throws IllegalArgumentException para n nenor que 0 e n maior que 9999.
     * @return true se o número possui a propriedade 3025, ou false se não possui.
     */

    public static boolean propriedade3025(int n) {
        if ((n < 0) || (n > 9999)) {
            throw new IllegalArgumentException("n invalido");
        }

        int i = n / 100;
        int j = n % 100;

        return ((i + j) * (i + j)) == n;
    }
}
