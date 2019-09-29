/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controlador.Controlador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author victor
 */
public class ControlerTest {
    
    public ControlerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
    public  void testTitulo(){      
        System.out.println("Metodo Titulo");
        String cadena = "Conversor de Moneda Local";
        String cadenaTitulo = "Conversor de Moneda Local";
        if(cadena.equalsIgnoreCase(cadenaTitulo)){
            System.out.println("Test Ok");          
        }else{
            System.out.println("Test Fallo");
        }
        
    }
}
