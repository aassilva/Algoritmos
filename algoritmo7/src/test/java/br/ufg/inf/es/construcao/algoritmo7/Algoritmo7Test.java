package br.ufg.inf.es.construcao.algoritmo7;

import org.junit.Assert;
import org.junit.Test;


public class Algoritmo7Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo7.propriedade3025(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo7.propriedade3025(55555);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertTrue(Algoritmo7.propriedade3025(0));
        Assert.assertFalse(Algoritmo7.propriedade3025(9999));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Algoritmo7.propriedade3025(3025));
        Assert.assertFalse(Algoritmo7.propriedade3025(9009));
        Assert.assertFalse(Algoritmo7.propriedade3025(910));
    }

}
