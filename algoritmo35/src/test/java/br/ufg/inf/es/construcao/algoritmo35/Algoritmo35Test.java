package br.ufg.inf.es.construcao.algoritmo35;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo35Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        int []d = {3};
        Algoritmo35.luhn(d);
    }

    @Test
    public void testCasoTrivial() {
        int []d = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 3};
        Assert.assertFalse(Algoritmo35.luhn(d));
        int []a = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 0};
        Assert.assertFalse(Algoritmo35.luhn(a));
        int [] b = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 1};
        Assert.assertFalse(Algoritmo35.luhn(b));
        int [] c = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 5};
        Assert.assertFalse(Algoritmo35.luhn(c));
        int [] e = {7, 9, 9, 2, 7, 3, 9, 8, 7, 1, 9 };
        Assert.assertFalse(Algoritmo35.luhn(e));
    }

}