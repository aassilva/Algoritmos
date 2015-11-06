package br.ufg.es.construcao.algoritmo24;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo24Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo24.divideSomas(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo24.divideSomas(3, 0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo24.divideSomas(10, 2));
        Assert.assertEquals(0, Algoritmo24.divideSomas(1, 2));
        Assert.assertEquals(6, Algoritmo24.divideSomas(20, 3));
        Assert.assertEquals(18, Algoritmo24.divideSomas(150, 8));
        Assert.assertEquals(5, Algoritmo24.divideSomas(25, 5));
        Assert.assertEquals(6, Algoritmo24.divideSomas(36, 6));
    }

}
