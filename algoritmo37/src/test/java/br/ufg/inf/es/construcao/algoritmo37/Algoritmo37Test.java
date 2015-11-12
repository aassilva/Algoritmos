package br.ufg.inf.es.construcao.algoritmo37;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo37Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo37.ackerman(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo37.ackerman(3, -1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1, Algoritmo37.ackerman(0, 0));
        Assert.assertEquals(2, Algoritmo37.ackerman(0, 1));
        Assert.assertEquals(4, Algoritmo37.ackerman(1, 2));
        Assert.assertEquals(7, Algoritmo37.ackerman(2, 2));
        Assert.assertEquals(61, Algoritmo37.ackerman(3, 3));
    }

}
