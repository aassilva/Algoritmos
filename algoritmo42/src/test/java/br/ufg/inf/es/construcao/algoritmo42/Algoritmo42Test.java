package br.ufg.inf.es.construcao.algoritmo42;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo42Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        Algoritmo42.somaNaturais(0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5050, Algoritmo42.somaNaturais(100));
        Assert.assertEquals(1275, Algoritmo42.somaNaturais(50));
        Assert.assertEquals(55, Algoritmo42.somaNaturais(10));
        Assert.assertEquals(66, Algoritmo42.somaNaturais(11));
        Assert.assertEquals(5671, Algoritmo42.somaNaturais(106));
        Assert.assertEquals(276, Algoritmo42.somaNaturais(23));
        Assert.assertEquals(2926, Algoritmo42.somaNaturais(76));
        Assert.assertEquals(190, Algoritmo42.somaNaturais(19));
    }

}