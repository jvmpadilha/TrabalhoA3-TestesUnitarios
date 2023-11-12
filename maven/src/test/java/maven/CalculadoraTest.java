package maven;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSomaint() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.somaInt(2, 3);
        assertEquals(5, result);
    }
    
    @Test
    public void testSubtract() {
        Calculadora calculadora = new Calculadora();
        int result = calculadora.subtraInt(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void testMultiplicaint() {
    	Calculadora calculadora = new Calculadora ();
    	int result = calculadora.multiplicaInt(5, 2);
    	assertEquals(10, result);
    }
    
    @Test
    public void testDivide() {
    	Calculadora calculadora = new Calculadora();
        int result = calculadora.divideInt(10, 2);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
    	Calculadora calculadora = new Calculadora();
    	calculadora.divideInt(5, 0);
    }

}   

