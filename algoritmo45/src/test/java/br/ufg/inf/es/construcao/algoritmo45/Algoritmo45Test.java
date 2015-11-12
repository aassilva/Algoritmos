package br.ufg.inf.es.construcao.algoritmo45;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo45Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo45.imprimeArray(new int[] {8, 34, 13}, -6);
    }

}