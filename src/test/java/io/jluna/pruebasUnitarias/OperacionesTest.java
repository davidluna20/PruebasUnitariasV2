package io.jluna.pruebasUnitarias;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private Operaciones operaciones;

    @Before
    public void Setup(){
        operaciones = new Operaciones();
    }
    @Test
    public void SumaTest(){
        Assert.assertEquals("La suma es diferente",11, operaciones.sumar(5,6));
    }

    @Test
    public void RestaTest(){
        Assert.assertEquals("La resta es diferente",1, operaciones.restar(6,5));
    }

    @Test
    public void MultiplicacionTest(){
        Assert.assertEquals("La multiplicacion es diferente",30, operaciones.multiplicar(5,6));
    }

    @Test
    public void DivisionTest(){
        Assert.assertEquals("La division es diferente",5, operaciones.dividir(10,2));
    }
}
