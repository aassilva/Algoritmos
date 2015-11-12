package br.ufg.inf.es.construcao.algoritmo48;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo48Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        int a[] = {1, 0 ,9, 5};
        Algoritmo48.bubleSort(a, -3);
    }

    @Test
    public void testCasoTrivial() {


        int[] b = {3, 5, 4, 1, 2};
        Algoritmo48.bubleSort(b, 5);

        int[] expected2 = {3, 5, 4, 2, 1};
        Assert.assertArrayEquals(expected2, b);
    }

}

