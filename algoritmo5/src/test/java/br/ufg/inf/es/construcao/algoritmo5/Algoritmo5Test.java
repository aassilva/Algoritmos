package br.ufg.inf.es.construcao.algoritmo5;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo5Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo5.potencia(-1, 10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() throws Exception {
        Algoritmo5.potencia(1, -9);
    }

    @Test
    public void testcasoDeFronteira() {
        Assert.assertEquals(1, Algoritmo5.potencia(10, 0));
        Assert.assertEquals(1, Algoritmo5.potencia(5, 0));
    }

    @Test
    public void TestcasoTriviais() {
        Assert.assertEquals(8, Algoritmo5.potencia(2, 3));
    }

}
