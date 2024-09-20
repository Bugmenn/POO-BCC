/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.Prova1.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gabriel Bugmann Vanzuita
 */
public class IngressoCinemaTest {
    
    public IngressoCinemaTest() {
    }    

    /**
     * Test of getDiaSemana method, of class IngressoCinema.
     */
    @Test
    public void testGetDiaSemana() {
        System.out.println("getDiaSemana");
        IngressoCinema instance = null;
        DiaSemana expResult = null;
        DiaSemana result = instance.getDiaSemana();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiaSemana method, of class IngressoCinema.
     */
    @Test
    public void testSetDiaSemana() {
        System.out.println("setDiaSemana");
        DiaSemana diaSemana = null;
        IngressoCinema instance = null;
        instance.setDiaSemana(diaSemana);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstudante method, of class IngressoCinema.
     */
    @Test
    public void testGetEstudante() {
        System.out.println("getEstudante");
        IngressoCinema instance = null;
        boolean expResult = false;
        boolean result = instance.getEstudante();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstudante method, of class IngressoCinema.
     */
    @Test
    public void testSetEstudante() {
        System.out.println("setEstudante");
        boolean estudante = false;
        IngressoCinema instance = null;
        instance.setEstudante(estudante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of precoIngresso method, of class IngressoCinema.
     * teste quarta e estudante falso
     */
    @Test
    public void testPrecoIngressoQuartaEFalse() {
        System.out.println("precoIngresso");
        IngressoCinema instance = new IngressoCinema(DiaSemana.QUARTA, false);
        float expResult = 7.5F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     * teste quarta e estudante verdadeiro
     */
    @Test
    public void testPrecoIngressoQuartaETrue() {
        System.out.println("precoIngresso");
        IngressoCinema instance = new IngressoCinema(DiaSemana.QUARTA, true);
        float expResult = 7.5F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     * teste sgunda e estudante verdadeiro
     */
    @Test
    public void testPrecoIngressoSegundaETrue() {
        System.out.println("precoIngresso");
        IngressoCinema instance = new IngressoCinema(DiaSemana.SEGUNDA, true);
        float expResult = 10.5F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     * teste sabado e estudante verdadeiro
     */
    @Test
    public void testPrecoIngressoSabadoETrue() {
        System.out.println("precoIngresso");
        IngressoCinema instance = new IngressoCinema(DiaSemana.SABADO, true);
        float expResult = 14.7F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of precoIngresso method, of class IngressoCinema.
     * teste sabado e estudante falso
     */
    @Test
    public void testPrecoIngressoSabadoEFalse() {
        System.out.println("precoIngresso");
        IngressoCinema instance = new IngressoCinema(DiaSemana.SABADO, false);
        float expResult = 21F;
        float result = instance.precoIngresso();
        assertEquals(expResult, result);
    }
    
}
