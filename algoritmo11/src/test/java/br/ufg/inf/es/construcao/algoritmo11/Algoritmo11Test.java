package br.ufg.inf.es.construcao.algoritmo11;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo11Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo11.mdc(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo11.mdc(5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() throws Exception {
        Algoritmo11.mdc(7, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuartoParametroInvalido() throws Exception {
        Algoritmo11.mdc(5, 6);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(1, Algoritmo11.mdc(1, 1));
        Assert.assertEquals(2, Algoritmo11.mdc(2, 2));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1, Algoritmo11.mdc(3, 1));
        Assert.assertEquals(91, Algoritmo11.mdc(2275, 1638));
        Assert.assertEquals(8, Algoritmo11.mdc(24, 16));
        Assert.assertEquals(32, Algoritmo11.mdc(416, 352));
        Assert.assertEquals(3, Algoritmo11.mdc(9, 3));
    }

}