package br.ufg.es.construcao.algoritmo28;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo28Test {

    /**
     * teste do primeiro método que retorna valor.
     */

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Algoritmo28.produto(0, 1));
        Assert.assertEquals(0, Algoritmo28.produto(1, 0));
        Assert.assertEquals(10, Algoritmo28.produto(1, 10));
        Assert.assertEquals(10, Algoritmo28.produto(10, 1));
    }

    @Test
    public void testCasoTriviaProdutol() {
        Assert.assertEquals(100, Algoritmo28.produto(10, 10));
        Assert.assertEquals(1000, Algoritmo28.produto(10, 100));
    }

    /**
     * teste o segundo método que retorna valor.
     */

    @Test
    public void testCasoTrivialDivideSomas() {
        Assert.assertEquals(5, Algoritmo28.divideSomas(25, 5));
        Assert.assertEquals(6, Algoritmo28.divideSomas(36, 6));
        Assert.assertEquals(1, Algoritmo28.divideSomas(1, 1));
    }

}