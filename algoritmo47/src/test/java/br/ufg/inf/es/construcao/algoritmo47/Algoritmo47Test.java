package br.ufg.inf.es.construcao.algoritmo47;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo47Test {

    @Test(expected = IllegalArgumentException.class)
    public void testEntradaNInvalido() throws Exception {
        int[] a = {1, 2, 4, 6, 8, 10, 12};
        Algoritmo47.mediaArray(a, -1);
    }

    @Test
    public void testMedias() throws Exception {
        int [] a = { 0, 2, 4, 6, 3, 5, 7};
        Assert.assertEquals(4, Algoritmo47.mediaArray(a, 6));
        int [] b = { 0, 2, 7, 9 };
        Assert.assertEquals(6, Algoritmo47.mediaArray(b, 3));
    }

}
