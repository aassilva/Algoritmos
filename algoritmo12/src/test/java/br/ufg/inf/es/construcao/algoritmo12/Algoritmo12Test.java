package br.ufg.inf.es.construcao.algoritmo12;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo12Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo12.mdc2(-1, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo12.mdc2(5, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParametroInvalido() throws Exception {
        Algoritmo12.mdc2(7, -1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuartoParametroInvalido() throws Exception {
        Algoritmo12.mdc2(5, 6);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(1, Algoritmo12.mdc2(1, 1));
        Assert.assertEquals(2, Algoritmo12.mdc2(2, 2));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo12.mdc2(25, 15));
        Assert.assertEquals(8, Algoritmo12.mdc2(24, 16));
        Assert.assertEquals(32, Algoritmo12.mdc2(416, 352));
        Assert.assertEquals(3, Algoritmo12.mdc2(9, 3));
    }

}