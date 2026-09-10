package AtvCalculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestCalculadora {

    @Test
    public void operacoesSoma(){
        Calculadora calc = new Calculadora();
        calc.setValor1(20.0);
        calc.setValor2(20.0);
        calc.setOperacao("+");

        assertEquals(40.0, calc.calcular(), 0.0);
    }
    @Test
    public void operacoesSub(){
        Calculadora calc = new Calculadora();
        calc.setValor1(20.0);
        calc.setValor2(20.0);
        calc.setOperacao("-");

        assertEquals(0.0, calc.calcular(), 0.0);
    }
    @Test
    public void operacoesMul(){
        Calculadora calc = new Calculadora();
        calc.setValor1(20.0);
        calc.setValor2(20.0);
        calc.setOperacao("*");

        assertEquals(400.0, calc.calcular(), 0.0);
    }

    @Test
    public void operacoesDivisao(){
        Calculadora calc = new Calculadora();
        calc.setValor1(20.0);
        calc.setValor2(20.0);
        calc.setOperacao("/");

        assertEquals(1.0, calc.calcular(), 0.0);
    }


    @Test(expected =IllegalArgumentException.class)
    public void operacoesDivisaoPorZero(){
        Calculadora calc = new Calculadora();
        calc.setValor1(20.0);
        calc.setValor2(0.0);
        calc.setOperacao("/");
        assertEquals(0, calc.calcular(), 0.0);



    }

    @Test(expected =IllegalArgumentException.class)
    public void operacoesErrada(){
        Calculadora calc = new Calculadora();
        calc.setValor1(20.0);
        calc.setValor2(20.0);
        calc.setOperacao("Batata");

        assertEquals(40.0, calc.calcular(), 0.0);
    }
}
