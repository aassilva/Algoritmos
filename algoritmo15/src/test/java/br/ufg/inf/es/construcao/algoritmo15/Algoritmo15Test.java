package br.ufg.inf.es.construcao.algoritmo15;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo15Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo15.pi(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(4.0, Algoritmo15.pi(1), 0.00001d);
        Assert.assertEquals((4/1 - 4/3 + 4/5), Algoritmo15.pi(3));
    }

}