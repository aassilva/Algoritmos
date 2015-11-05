package br.ufg.inf.es.construcao.algoritmo6;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo6Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo6.potenciaSoma(-10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Algoritmo6.potenciaSoma(15, 0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1000, Algoritmo6.potenciaSoma(10, 3));
        Assert.assertEquals(25, Algoritmo6.potenciaSoma(5, 2));
        Assert.assertEquals(243, Algoritmo6.potenciaSoma(3, 5));
    }
}