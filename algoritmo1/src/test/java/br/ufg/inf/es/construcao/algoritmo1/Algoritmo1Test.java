package br.ufg.inf.es.construcao.algoritmo1;

import junit.framework.Assert;
import org.junit.Test;

public class Algoritmo1Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParamentroInvalido() throws Exception {
        Algoritmo1.diaSemana(0, 2, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParamentroInvalido() throws Exception {
        Algoritmo1.diaSemana(32, 2, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTerceiroParamentroInvalido() throws Exception {
        Algoritmo1.diaSemana(2, 0, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuartoParamentroInvalido() throws Exception {
        Algoritmo1.diaSemana(3, 13, 2015);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuintoParamentroInvalido() throws Exception {
        Algoritmo1.diaSemana(3, 2, 1600);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsextoParamentroInvalido() throws Exception {
        Algoritmo1.diaSemana(0, -1, 1600);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetimoParamentroInvalido() throws Exception {
        Algoritmo1.diaSemana(32, 14, 1500);
    }

    /**
     * Valores obtidos do calendário do Linux.
     */
    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(3, Algoritmo1.diaSemana(29, 10, 2015));
        Assert.assertEquals(2, Algoritmo1.diaSemana(28, 10, 2015));
        Assert.assertEquals(4, Algoritmo1.diaSemana(30, 10, 2015));
        Assert.assertEquals(5, Algoritmo1.diaSemana(25, 9, 1999));
        Assert.assertEquals(6, Algoritmo1.diaSemana(31, 1, 1999));
        Assert.assertEquals(5, Algoritmo1.diaSemana(25, 9, 1999));
        Assert.assertEquals(0, Algoritmo1.diaSemana(1, 1, 1753));
        Assert.assertEquals(0, Algoritmo1.diaSemana(19, 5, 3253));
    }

}
