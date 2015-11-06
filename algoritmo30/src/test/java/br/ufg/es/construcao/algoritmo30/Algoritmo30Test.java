package br.ufg.es.construcao.algoritmo30;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo30Test {


    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        int a[] = {1, 0 ,9, 5};
        Algoritmo30.polSimples(2, 0, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        int [] a = {2, 7, 0};
        Algoritmo30.polSimples(3, 0, a);
    }

    @Test
    public void testCasoDeFronteira() {
        int [] a = {3, 2, 5, 1, 4};
        Assert.assertEquals(99, Algoritmo30.polSimples(2, 4, a));
    }

    @Test
    public void testCasoTrivial() {
        int [] a = {3, -2, -4, -8};
        Assert.assertEquals(-11, Algoritmo30.polSimples( 1, 3, a));

    }

}