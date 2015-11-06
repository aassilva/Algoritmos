package br.ufg.es.construcao.algoritmo21;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo21Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo21.quadradoPerfeito(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertFalse(Algoritmo21.quadradoPerfeito(26));
        Assert.assertTrue(Algoritmo21.quadradoPerfeito(25));
        Assert.assertTrue(Algoritmo21.quadradoPerfeito(36));
        Assert.assertTrue(Algoritmo21.quadradoPerfeito(49));
        Assert.assertFalse(Algoritmo21.quadradoPerfeito(41));
        Assert.assertFalse(Algoritmo21.quadradoPerfeito(28));
        Assert.assertFalse(Algoritmo21.quadradoPerfeito(89));
        Assert.assertTrue(Algoritmo21.quadradoPerfeito(100));
        Assert.assertTrue(Algoritmo21.quadradoPerfeito(289));

    }

}