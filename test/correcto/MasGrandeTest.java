/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcto;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rafae
 */
public class MasGrandeTest {
    
    public MasGrandeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of max method, of class MasGrande.
     */
    @Test
    public void testCardinalidad() {
        //Array Vacio
        System.out.println("cardinalidad1");
        int[] a = new int[]{};
        int result = MasGrande.max(a);
        assertEquals(0, result);
        
        //Array con un elemento
        System.out.println("cardinalidad2");
        a = new int[]{4};
        result = MasGrande.max(a);
        assertEquals(4, result);
        
        //Array con múltiples elementos
        System.out.println("cardinalidad3");
        a = new int[] {1, 2, 3, 4};
        result = MasGrande.max(a);
        assertEquals(4, result);
    }
    
    @Test
    public void testOrden() {
        //Array desordenado
        System.out.println("orden1");
        int[] a = new int[]{3,1,2};
        int result = MasGrande.max(a);
        assertEquals(3, result);

        //Array ordenado descendientemente
        System.out.println("orden2");
        a = new int[]{3,2,1};
        result = MasGrande.max(a);
        assertEquals(3, result);
        
        //Array ordenado ascendientemente
        System.out.println("orden3");
        a = new int[]{1,2,3};
        result = MasGrande.max(a);
        assertEquals(3, result);
    }
    
    @Test
    public void testRango() {
        //Array con elementos positivos
        System.out.println("rango1");
        int[] a = new int[]{1,2,3};
        int result = MasGrande.max(a);
        assertEquals(3, result);
        
        //Array con elementos negativos
        System.out.println("rango2");
        a = new int[]{-1,-2,-3};
        result = MasGrande.max(a);
        assertEquals(-1, result);
        
        //Array con elementos mixtos
        System.out.println("rango3");
        a = new int[]{-1,2,-3};
        result = MasGrande.max(a);
        assertEquals(2, result);
    }
    
    @Test(expected = NullPointerException.class)
    public void testExistencia() {
        System.out.println("existencia");
        int result = MasGrande.max(null);
    }
}
