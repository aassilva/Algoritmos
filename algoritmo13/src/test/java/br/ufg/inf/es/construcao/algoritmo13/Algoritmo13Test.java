package br.ufg.inf.es.construcao.algoritmo13;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo13Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo13.numeroHarmonico(-1);
    }

    @Test
    public void testCasoDeFronteira() {
        Assert.assertEquals(1, Algoritmo13.numeroHarmonico(1), 0.00001d);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1, Algoritmo13.numeroHarmonico(10), 0.001d);
    }

}
