package br.ufg.inf.es.construcao.algoritmo32;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo32Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo32.fibonacci(-1);
    }

    @Test
    public void testCasosDeFronteira() {
        Assert.assertEquals(0, Algoritmo32.fibonacci(0));
        Assert.assertEquals(1, Algoritmo32.fibonacci(1));
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(13, Algoritmo32.fibonacci(7));
        Assert.assertEquals(2, Algoritmo32.fibonacci(3));
        Assert.assertEquals(1597, Algoritmo32.fibonacci(17));
        Assert.assertEquals(28657, Algoritmo32.fibonacci(23));
        Assert.assertEquals(2178309, Algoritmo32.fibonacci(32));
    }

}