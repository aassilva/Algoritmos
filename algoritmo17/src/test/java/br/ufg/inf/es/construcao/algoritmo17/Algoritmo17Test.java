package br.ufg.inf.es.construcao.algoritmo17;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo17Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo17.fatorialSoma(-1);
    }

    @Test
    public void testCasoDeFronteira() {
        Assert.assertEquals(1, Algoritmo17.fatorialSoma(1));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(720, Algoritmo17.fatorialSoma(6));
        Assert.assertEquals(120, Algoritmo17.fatorialSoma(5));
        Assert.assertEquals(40320, Algoritmo17.fatorialSoma(8));
        Assert.assertEquals(6, Algoritmo17.fatorialSoma(3));
        Assert.assertEquals(24, Algoritmo17.fatorialSoma(4));
        Assert.assertEquals(5040, Algoritmo17.fatorialSoma(7));
        Assert.assertEquals(479001600, Algoritmo17.fatorialSoma(12));
    }

}

