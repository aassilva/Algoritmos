package br.ufg.inf.es.construcao.algoritmo40;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo40Test {

    @Test
    public void testCasoTrivial() {
        Assert.assertFalse(Algoritmo40.atendeSomaFatDigitos(111));
        Assert.assertTrue(Algoritmo40.atendeSomaFatDigitos(145));
        Assert.assertFalse(Algoritmo40.atendeSomaFatDigitos(17296));
        Assert.assertFalse(Algoritmo40.atendeSomaFatDigitos(118));
        Assert.assertFalse(Algoritmo40.atendeSomaFatDigitos(172));
    }

}