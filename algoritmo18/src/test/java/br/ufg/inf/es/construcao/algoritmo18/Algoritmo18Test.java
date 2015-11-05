package br.ufg.inf.es.construcao.algoritmo18;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo18Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo18.logNaturalSimples(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo18.logNaturalSimples(6, 1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(90, Algoritmo18.logNaturalSimples(5, 5));
        Assert.assertEquals(366, Algoritmo18.logNaturalSimples(6, 9));
        Assert.assertEquals(908, Algoritmo18.logNaturalSimples(7, 9));
        Assert.assertEquals(17, Algoritmo18.logNaturalSimples(3, 5));
        Assert.assertEquals(2134, Algoritmo18.logNaturalSimples(8, 9));
        Assert.assertEquals(41, Algoritmo18.logNaturalSimples(4, 5));
        Assert.assertEquals(6, Algoritmo18.logNaturalSimples(2, 7));
        Assert.assertEquals(126, Algoritmo18.logNaturalSimples(5, 7));
    }

}
