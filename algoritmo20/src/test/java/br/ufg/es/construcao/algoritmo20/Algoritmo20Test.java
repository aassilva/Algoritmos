package br.ufg.es.construcao.algoritmo20;

import junit.framework.Assert;
import org.junit.Test;

public class Algoritmo20Test {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParamentroInvalido() throws Exception {
        Algoritmo20.razaoAurea(-1, 2, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParamentroInvalido() throws Exception {
        Algoritmo20.razaoAurea(1, -6, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TerceiroParamentroInvalido() throws Exception {
        Algoritmo20.razaoAurea(1, 2, -5);
    }

    @Test
    public void CasosDeFronteiras() {
        Assert.assertEquals(1.61803398875, Algoritmo20.razaoAurea(1, 3, 500), 0.00001d);
    }

}
