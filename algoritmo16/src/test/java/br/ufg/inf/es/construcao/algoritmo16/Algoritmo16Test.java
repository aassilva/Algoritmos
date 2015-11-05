package br.ufg.inf.es.construcao.algoritmo16;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo16Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo16.fatorial(-1);
    }

    @Test
    public void testCasoDeFronteira() {
        Assert.assertEquals(1, Algoritmo16.fatorial(1));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(720, Algoritmo16.fatorial(6));
        Assert.assertEquals(120, Algoritmo16.fatorial(5));
        Assert.assertEquals(40320, Algoritmo16.fatorial(8));
        Assert.assertEquals(6, Algoritmo16.fatorial(3));
        Assert.assertEquals(24, Algoritmo16.fatorial(4));
        Assert.assertEquals(5040, Algoritmo16.fatorial(7));
        Assert.assertEquals(479001600, Algoritmo16.fatorial(12));
    }

}
