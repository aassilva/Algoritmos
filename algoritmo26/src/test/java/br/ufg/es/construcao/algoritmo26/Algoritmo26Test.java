package br.ufg.es.construcao.algoritmo26;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo26Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo26.modSimples(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo26.modSimples(3, -2);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(0, Algoritmo26.modSimples(18, 2));
        Assert.assertEquals(1, Algoritmo26.modSimples(7, 2));
        Assert.assertEquals(2, Algoritmo26.modSimples(2501, 3));
        Assert.assertEquals(4, Algoritmo26.modSimples(20, 8));
        Assert.assertEquals(4, Algoritmo26.modSimples(4, 56));
        Assert.assertEquals(40, Algoritmo26.modSimples(40, 56));
        Assert.assertEquals(3, Algoritmo26.modSimples(9, 6));
        Assert.assertEquals(4, Algoritmo26.modSimples(4, 5));
        Assert.assertEquals(3, Algoritmo26.modSimples(3, 7));
        Assert.assertEquals(4, Algoritmo26.modSimples(4, 9));
    }

}
