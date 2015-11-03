package br.ufg.inf.es.construcao.algoritmo8;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo8Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo8.propriedade153(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo8.propriedade153(1000);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertTrue(Algoritmo8.propriedade153(0));
        Assert.assertFalse(Algoritmo8.propriedade153(999));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Algoritmo8.propriedade153(153));
        Assert.assertFalse(Algoritmo8.propriedade153(909));
        Assert.assertFalse(Algoritmo8.propriedade153(10));
    }
}