package br.ufg.inf.es.construcao.algoritmo43;

import java.util.List;

/**
 * Classe que implementa a permutação.
 */

public class Algoritmo43 {

    /**
     * Serviço que faz a permutação de um conjunto.
     * @param p prefixo.
     * @param s conjunto.
     */

    public static void permutacao(String p, String s) {
        if (s.length() == 1){
            System.out.print(p + s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                char cI = s.charAt(i);
                StringBuilder sl = new StringBuilder(s);
                sl.deleteCharAt(i);
                String pl = p + cI;
                permutacao(pl, sl.toString());
            }
        }
    }

    public static List<String> permuta(
            String prefixo,
            String conjunto,
            List<String> resultadoParcial) {
        if (conjunto.length() == 1) {
            resultadoParcial.add(prefixo + conjunto);
            return resultadoParcial;
        }

        for (int i = 0; i < conjunto.length(); i++) {
            char cI = conjunto.charAt(i);

            StringBuilder sLinha = new StringBuilder(conjunto);
            sLinha.deleteCharAt(i);

            String pLinha = prefixo + cI;

            permuta(pLinha, sLinha.toString(), resultadoParcial);
        }

        return resultadoParcial;
    }
}