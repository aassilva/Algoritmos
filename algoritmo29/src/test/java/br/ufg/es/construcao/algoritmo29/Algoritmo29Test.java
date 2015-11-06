package br.ufg.es.construcao.algoritmo29;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo29Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo29.raizQuadrada(-1, 5);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(3, Algoritmo29.raizQuadrada(9, 2));
        Assert.assertEquals(9, Algoritmo29.raizQuadrada(81, 3));
        Assert.assertEquals(5, Algoritmo29.raizQuadrada(25, 2));
        Assert.assertEquals(6, Algoritmo29.raizQuadrada(36, 6));
        Assert.assertEquals(2, Algoritmo29.raizQuadrada(4, 56));
        Assert.assertEquals(6, Algoritmo29.raizQuadrada(40, 56));
        Assert.assertEquals(3, Algoritmo29.raizQuadrada(9, 56));
    }

}

