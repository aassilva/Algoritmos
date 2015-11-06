package br.ufg.es.construcao.algoritmo22;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo22Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo22.amigos(-1, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo22.amigos(6, -1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Algoritmo22.amigos(220, 284));
        Assert.assertTrue(Algoritmo22.amigos(1184, 1210));
        Assert.assertTrue(Algoritmo22.amigos(17296, 18416));
        Assert.assertFalse(Algoritmo22.amigos(41, 54));
        Assert.assertFalse(Algoritmo22.amigos(28, 87));
        Assert.assertFalse(Algoritmo22.amigos(89, 90));
    }

}