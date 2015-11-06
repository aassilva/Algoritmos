package br.ufg.es.construcao.algoritmo25;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo25Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo25.divideSubtracoes(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo25.divideSubtracoes(3, 0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo25.divideSubtracoes(10, 2));
        Assert.assertEquals(1, Algoritmo25.divideSubtracoes(3, 2));
        Assert.assertEquals(6, Algoritmo25.divideSubtracoes(20, 3));
        Assert.assertEquals(18, Algoritmo25.divideSubtracoes(150, 8));
        Assert.assertEquals(6, Algoritmo25.divideSubtracoes(36, 6));
    }

}
