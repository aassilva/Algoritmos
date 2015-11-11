package br.ufg.inf.es.construcao.algoritmo35;

/**
 * Classe que implementa o luhn.
 */

public class Algoritmo35 {

    /**
     * Servi�o que valida uma variedade de n�meros de identifica��o.
     * @param n vetor de n�meros inteiros.
     * @throws IllegalArgumentException  para vetor com menos de 2 posi��es.
     * @return true n�meros possui digito verificador ou false quando n�o possui.
     */

    public static boolean luhn(int[]n){
        if (n.length < 2){
            throw new IllegalArgumentException("k invalido");
        }

        int i = 0;
        int p = 0;
        int l = n.length -1;
        boolean a = false;
        while (l > 0){
            if (a){
                p = p + n[l];
            } else {
                int t = n[l] * 2;
                i = i +(t / 10) + (t % 10);
            }

            l = l - 1;
            a = ! a;
        }

        return 10 - ((i + p) % 10) == 0;
    }
}
