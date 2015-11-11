package br.ufg.inf.es.construcao.algoritmo46;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo46Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        int []d = {3};
        Algoritmo46.somaArray(d, -1);
    }

    @Test
    public void testCasoTrivial() {
        int []d = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 3};
        Assert.assertEquals(7, Algoritmo46.somaArray(d, 0));
        int []a = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 0};
        Assert.assertEquals(16, Algoritmo46.somaArray(a, 1));
        int [] b = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 1};
        Assert.assertEquals(25, Algoritmo46.somaArray(b, 2));
        int [] c = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 5};
        Assert.assertEquals(27, Algoritmo46.somaArray(c, 3));
        int [] e = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 9 };
        Assert.assertEquals(34, Algoritmo46.somaArray(e, 4));
    }

}