package br.ufg.inf.es.construcao.algoritmo9;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo9Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalidoMenor() throws Exception {
        Algoritmo9.primo(-1);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertTrue(Algoritmo9.primo(23));
        Assert.assertTrue(Algoritmo9.primo(3));
        Assert.assertFalse(Algoritmo9.primo(26));
    }

}