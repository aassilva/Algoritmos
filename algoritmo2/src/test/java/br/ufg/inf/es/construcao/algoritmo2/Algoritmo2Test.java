package br.ufg.inf.es.construcao.algoritmo2;

import junit.framework.Assert;
import org.junit.Test;

public class Algoritmo2Test {

    @Test
    public void TestCasoTrivial() {
        Assert.assertEquals(true, Algoritmo2.paridade(2));
        Assert.assertEquals(false, Algoritmo2.paridade(3));
        Assert.assertEquals(true, Algoritmo2.paridade(1000));
        Assert.assertEquals(true, Algoritmo2.paridade(2));
        Assert.assertEquals(false, Algoritmo2.paridade(1001));
        Assert.assertEquals(false, Algoritmo2.paridade(9));
        Assert.assertEquals(false, Algoritmo2.paridade(-5));
        Assert.assertEquals(true, Algoritmo2.paridade(10000));
        Assert.assertEquals(true, Algoritmo2.paridade(-8));
    }

}
