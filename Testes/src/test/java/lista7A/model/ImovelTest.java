/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista7A.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabri
 */
public class ImovelTest {
    
    public ImovelTest() {
    }
    
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Imovel instance = null;
        String expResult = "";
        String result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Imovel.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        String endereco = "";
        Imovel instance = null;
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Imovel.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Imovel instance = null;
        int expResult = 0;
        int result = instance.getArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Imovel.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        int area = 0;
        Imovel instance = null;
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Imovel.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Imovel instance = null;
        Bairro expResult = null;
        Bairro result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Imovel.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        Bairro bairro = null;
        Imovel instance = null;
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFinalidade method, of class Imovel.
     */
    @Test
    public void testGetFinalidade() {
        System.out.println("getFinalidade");
        Imovel instance = null;
        Finalidade expResult = null;
        Finalidade result = instance.getFinalidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFinalidade method, of class Imovel.
     */
    @Test
    public void testSetFinalidade() {
        System.out.println("setFinalidade");
        Finalidade finalidade = null;
        Imovel instance = null;
        instance.setFinalidade(finalidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularIptu method, of class Imovel.
     */
    @Test
    public void testCalcularIptu() {
        System.out.println("calcularIptu");
        Imovel instance = null;
        double expResult = 0.0;
        double result = instance.calcularIptu();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testAreaNegativa() {
        System.out.println("AreaNegativa");
        Imovel imovel = new Imovel("teste", 0);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                imovel.setArea(-5);
            }
        );
        String result = exception.getMessage();
        String expected = "Valor de área invalido";
        assertEquals(expected, result);
    }
    
    @Test
    public void testSemArea() {
        System.out.println("SemArea");
        Bairro bairro = new Bairro("teste", 1);
        Imovel imovel = new Imovel("teste", 0);
        imovel.setBairro(bairro);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                imovel.calcularIptu();
            }
        );
        String esperado = "Finalidade";
        String result = exception.getMessage();
        assertEquals(esperado, result);
    }
}
