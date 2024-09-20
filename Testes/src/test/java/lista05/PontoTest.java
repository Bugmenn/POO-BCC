/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista05;

import lista05.Ponto;
import lista05.Quadrante;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gbvanzuita
 */
public class PontoTest {
    
    public PontoTest() {
    }
    
    /**
     * Test of getX method, of class Ponto.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Ponto instance = new Ponto();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        
        assertEquals(1, new Ponto(1, 1).getX());
    }

    /**
     * Test of setX method, of class Ponto.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Ponto instance = new Ponto();
        instance.setX(x);
    }

    /**
     * Test of getY method, of class Ponto.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Ponto instance = new Ponto();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Ponto.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Ponto instance = new Ponto();
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of identificarQuadrante method, of class Ponto.
     */
    @Test
    public void testIdentificarQuadrante() {
        Ponto instance = new Ponto();
        Quadrante expResult = Quadrante.NENHUM;
        Quadrante result = instance.identificarQuadrante();
        assertEquals(expResult, result);
        assertEquals(Quadrante.PRIMEIRO, new Ponto(1,1).identificarQuadrante());
        assertEquals(Quadrante.SEGUNDO, new Ponto(-1,1).identificarQuadrante());
        assertEquals(Quadrante.TERCEIRO, new Ponto(-1,-1).identificarQuadrante());
        assertEquals(Quadrante.QUARTO, new Ponto(1,-1).identificarQuadrante());
    }

    /**
     * Test of estaIncidindoSobreX method, of class Ponto.
     */
    @Test
    public void testEstaIncidindoSobreX() {
        System.out.println("estaIncidindoSobreX");
        Ponto instance = new Ponto();
        boolean expResult = true;
        boolean result = instance.estaIncidindoSobreX();
        assertEquals(expResult, result);
    }

    /**
     * Test of estaIncidindoSobreY method, of class Ponto.
     */
    @Test
    public void testEstaIncidindoSobreY() {
        System.out.println("estaIncidindoSobreY");
        Ponto instance = new Ponto();
        boolean expResult = false;
        boolean result = instance.estaIncidindoSobreY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDistancia method, of class Ponto.
     */
    @Test
    public void testCalcularDistancia_Ponto() {
        System.out.println("calcularDistancia");
        Ponto outroPonto = null;
        Ponto instance = new Ponto();
        double expResult = 0.0;
        double result = instance.calcularDistancia(outroPonto);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDistancia method, of class Ponto.
     */
    @Test
    public void testCalcularDistancia_Ponto_Ponto() {
        System.out.println("calcularDistancia");
        Ponto p1 = null;
        Ponto p2 = null;
        double expResult = 0.0;
        double result = Ponto.calcularDistancia(p1, p2);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
