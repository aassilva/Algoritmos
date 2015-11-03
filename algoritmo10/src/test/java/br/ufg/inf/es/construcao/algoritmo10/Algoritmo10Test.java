package br.ufg.inf.es.construcao.algoritmo10;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo10Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() {
        Algoritmo10.crivoEratostenes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamnetroInvalido() {
        Algoritmo10.crivoEratostenes(new int[]{1}, 2);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParamnetroInvalido() {
        Algoritmo10.crivoEratostenes(new int[]{1, 3, 5, 6, 8}, 2);
    }


    @Test
    public void testVetorTresPosicao() {
        int[] a = {1, 2, 0};
        Algoritmo10.crivoEratostenes(a, 2);
        Assert.assertEquals(0, a[2]);
    }

    @Test
    public void testVetorSetePosicao() {
        int[] a = {1, 2, 0, 0, 0, 0, 0};
        Algoritmo10.crivoEratostenes(a, 6);
        Assert.assertEquals(1, a[6]);
    }

}