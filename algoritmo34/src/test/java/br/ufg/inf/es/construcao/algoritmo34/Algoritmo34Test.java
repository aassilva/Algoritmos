package br.ufg.inf.es.construcao.algoritmo34;

import org.junit.Assert;
import org.junit.Test;


public class Algoritmo34Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        int []a = {2, 3, 5, 6, 7, 8};
        Algoritmo34.Cpf(a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        int []a = {0, 2, 3, 5, 6, 7, 8, 4, 2, 5, 6, 7, 2, 1};
        Algoritmo34.Cpf(a);
    }

    @Test
    public void testCasoTrivial() {
        int[] d = {0, 0, 5, 0, 8, 8, 3, 1, 2, 5, 3, 9};
        Assert.assertTrue(Algoritmo34.Cpf(d));
        int[] a = {0, 0, 1, 2, 1, 2, 4, 5, 0, 1, 2, 4};
        Assert.assertTrue(Algoritmo34.Cpf(a));
        int[] b = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Assert.assertTrue(Algoritmo34.Cpf(b));
        int[] r = {0, 0, 5, 0, 8, 8, 3, 1, 2, 5, 3, 8};
        Assert.assertFalse(Algoritmo34.Cpf(r));
    }

}