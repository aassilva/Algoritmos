package home.alunoinf.avaliacao.algoritmo6;

import org.junit.Assert;
import org.junit.Test;

public class Algoritmo6Test {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Algoritmo6.produto(-10, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testsegundoParametroInvalido() throws Exception {
        Algoritmo6.produto(15, 0);
    }

    @Test
    public void testCasoTrivial() {
        Assert.assertEquals(1000, Algoritmo6.produto(10, 3));
        Assert.assertEquals(25, Algoritmo6.produto(5, 2));
        Assert.assertEquals(243, Algoritmo6.produto(3, 5));
    }
}