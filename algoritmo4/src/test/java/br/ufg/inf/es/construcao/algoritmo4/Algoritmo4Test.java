package br.ufg.inf.es.construcao.algoritmo4;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo4Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo4.produto(-1, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Algoritmo4.produto(1, -10);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Algoritmo4.produto(0, 1));
        Assert.assertEquals(0, Algoritmo4.produto(1, 0));
        Assert.assertEquals(10, Algoritmo4.produto(1, 10));
        Assert.assertEquals(10, Algoritmo4.produto(10, 1));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(100, Algoritmo4.produto(10, 10));
        Assert.assertEquals(1000, Algoritmo4.produto(10, 100));
    }

}