/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entidades.Rectangulo;
import Service.RectanguloService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciana
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    RectanguloService rs;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        rs = new RectanguloService();
    }
    
    @After
    public void tearDown() {
    }

    // los tests deben ser publicos y no deben retornar nada
   @Test
    public void deberiaInicialiarColor() {
       assertNotNull(new Rectangulo(10,10).getColor());
   }
    
    @Test 
    public void deberiaCalcularArea() {
    assertEquals(100, rs.calcularArea(new Rectangulo(10,10)),0);
    assertEquals(20, rs.calcularArea(new Rectangulo(4,5)),0);
    assertEquals(1, rs.calcularArea(new Rectangulo(1,1)),0);
    }
    
    @Test 
    public void deberiaCalcularPerimetro() {
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10,10)), 0);
        assertEquals(100, rs.calcularPerimetro(new Rectangulo(20,30)), 0);
        assertEquals(30, rs.calcularPerimetro(new Rectangulo(5,10)), 0);
    }
    
    @Test 
    public void deberiaActivarODesactivar() {
        Rectangulo r = new Rectangulo(5,5);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
        
    }
}
