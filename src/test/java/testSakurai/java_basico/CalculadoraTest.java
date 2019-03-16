package testSakurai.java_basico;

import testSakurai.java_basico.model.Calculadora;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora calculadora = null;

    @Before
    public void setUp(){
        this.calculadora = new Calculadora();
    }

    @Test
    public void deveTrazerAlgumResultadoNaSoma(){
        double res = calculadora.calcula(2, 10, 1);
        Assert.assertEquals(12, res, 0000.1);
    }

    public void deveTrazerAlgumResultadoNaSubtracao(){
        double res = calculadora.calcula(5,5,2);
        Assert.assertEquals(0,res);
    }

    public void deveTrazerAlgumResultadoNaMultiplicaxao(){
        double res = calculadora.calcula(5,5,3);
        Assert.assertEquals(25,res);
    }

    public void deveTrazerAlgumResultadoNadivisao(){
        double res = calculadora.calcula(5,5,4);
        Assert.assertEquals(1,res);
    }

}
