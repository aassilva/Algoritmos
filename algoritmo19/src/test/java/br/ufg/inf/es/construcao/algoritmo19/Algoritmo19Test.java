package br.ufg.inf.es.construcao.algoritmo19;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo19Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo19.logn(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo19.logn(6, 1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(61, Algoritmo19.logn(6, 3), 0.00001d);
        Assert.assertEquals(91.41666, Algoritmo19.logn(5, 5), 0.00001d);
        Assert.assertEquals(2432.121269, Algoritmo19.logn(8, 10), 0.00001d);
        Assert.assertEquals(19.8464285, Algoritmo19.logn(3, 7), 0.00001d);
        Assert.assertEquals(42.866666, Algoritmo19.logn(4, 5), 0.00001d);
        Assert.assertEquals(656.56944, Algoritmo19.logn(7, 7), 0.00001d);
        Assert.assertEquals(373.0, Algoritmo19.logn(12, 3), 0.00001d);
    }

}
