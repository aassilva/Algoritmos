package br.ufg.inf.es.construcao.algoritmo31;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo31Test {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() throws Exception {
        int []d = {3,5,7};
        Algoritmo31.polHorner(3, -1, d);
    }

    @Test
    public void testCasoDeFronteira() {
        int []d = {2, 2, 2};
        Assert.assertEquals(4, Algoritmo31.polHorner(1, 1, d));
    }

    @Test
    public void testCasoTrivial() {
        int []d = {2, 3, 5, 9};
        Assert.assertEquals(19, Algoritmo31.polHorner(1, 3, d));
    }

}
