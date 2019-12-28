package io.jluna.pruebasUnitarias;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CadenasTest {
    private Cadenas cadenas;

    @Before
    public void setUp() throws Exception {
        cadenas = new Cadenas();
    }
    @Test
    public void concatenar(){

        String esperado = "Pedro Perez";
        Assert.assertEquals("no es lo esperado", esperado, cadenas.concatenar("Pedro","Perez"));
    }
}