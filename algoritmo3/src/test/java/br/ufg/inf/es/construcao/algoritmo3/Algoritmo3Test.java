package br.ufg.inf.es.construcao.algoritmo3;

import junit.framework.Assert;
import org.junit.Test;

public class Algoritmo3Test {

    @Test(expected = IllegalArgumentException.class)
    public void testParamentroInvalido() throws Exception {
        Algoritmo3.somaNaturais(-5);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(15, Algoritmo3.somaNaturais(5));
        Assert.assertEquals(1275, Algoritmo3.somaNaturais(50));
        Assert.assertEquals(1830, Algoritmo3.somaNaturais(60));
        Assert.assertEquals(4095, Algoritmo3.somaNaturais(90));
        Assert.assertEquals(5050, Algoritmo3.somaNaturais(100));
        Assert.assertEquals(1, Algoritmo3.somaNaturais(1));
        Assert.assertEquals(1035, Algoritmo3.somaNaturais(45));
        Assert.assertEquals(2850, Algoritmo3.somaNaturais(75));
        Assert.assertEquals(2415, Algoritmo3.somaNaturais(69));
        Assert.assertEquals(190, Algoritmo3.somaNaturais(19));

    }

}


