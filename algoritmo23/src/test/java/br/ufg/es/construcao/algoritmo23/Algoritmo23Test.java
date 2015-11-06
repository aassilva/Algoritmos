package br.ufg.es.construcao.algoritmo23;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo23Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo23.somaDivisores(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(220, Algoritmo23.somaDivisores(284));
        Assert.assertEquals(1184, Algoritmo23.somaDivisores(1210));
        Assert.assertEquals(17296, Algoritmo23.somaDivisores(18416));
    }

}
