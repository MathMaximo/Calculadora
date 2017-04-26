/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 255278
 */
public class CalculadoraTest {
    
    Calculadora calc = new Calculadora();
    public CalculadoraTest() {
    }
    

  
    @Test
    public void testSoma() {
      
        assertEquals(30, calc.soma(10,20), 0);
    }

 
    @Test
    public void testSubtracao() {
        assertEquals(20, calc.subtracao(30, 10), 0);
    }


    @Test
    public void testMultiplicacao() {
        assertEquals(40, calc.multiplicacao(4, 10), 0);
    }
    
}
