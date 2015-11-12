package br.ufg.inf.es.construcao.algoritmo43;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Algoritmo43Test {
    @Test
    public void testCasoTrivial() {
        List<String> retorno = Algoritmo43.permuta("", "a", new ArrayList<String>());
        Assert.assertEquals(1, retorno.size());
        Assert.assertEquals("a", retorno.get(0));
    }

    @Test
    public void testOutroCasoTrivial() {
        List<String> retorno = Algoritmo43.permuta("", "ab", new ArrayList<String>());
        Assert.assertEquals(2, retorno.size());
        Assert.assertTrue(retorno.contains("ab"));
        Assert.assertTrue(retorno.contains("ba"));
    }

    @Test
    public void testOutroCasoNaoTrivial() {
        List<String> retorno = Algoritmo43.permuta("", "abcd", new ArrayList<String>());
        Assert.assertEquals(24, retorno.size());
    }
}
