package br.ufg.inf.es.construcao.algoritmo14;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo14Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo14.somatoria(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals((1/2 + 1/5), Algoritmo14.somatoria(2));
    }

}
