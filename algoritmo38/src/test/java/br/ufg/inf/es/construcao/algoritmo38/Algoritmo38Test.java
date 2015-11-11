package br.ufg.inf.es.construcao.algoritmo38;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo38Test {

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(5, Algoritmo38.hipotenusa(4, 3));
        Assert.assertEquals(15, Algoritmo38.hipotenusa(9, 12));
        Assert.assertEquals(25, Algoritmo38.hipotenusa(20, 15));
        Assert.assertEquals(80, Algoritmo38.hipotenusa(64, 48));
        Assert.assertEquals(20, Algoritmo38.hipotenusa(16, 12));
    }

}