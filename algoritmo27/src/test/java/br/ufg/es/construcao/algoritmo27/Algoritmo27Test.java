package br.ufg.es.construcao.algoritmo27;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo27Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo27.mod(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo27.mod(3, -2);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(0, Algoritmo27.mod(18, 2));
        Assert.assertEquals(1, Algoritmo27.mod(7, 2));
        Assert.assertEquals(2, Algoritmo27.mod(2501, 3));
        Assert.assertEquals(4, Algoritmo27.mod(20, 8));
        Assert.assertEquals(4, Algoritmo27.mod(4, 56));
        Assert.assertEquals(40, Algoritmo27.mod(40, 56));
        Assert.assertEquals(3, Algoritmo27.mod(9, 6));
        Assert.assertEquals(4, Algoritmo27.mod(4, 5));
        Assert.assertEquals(3, Algoritmo27.mod(3, 7));
        Assert.assertEquals(4, Algoritmo27.mod(4, 9));
    }

}
