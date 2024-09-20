/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista6.model;

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
public class FuncionarioTest {
    
    public FuncionarioTest() {
    }    

    /**
     * Test of getNome method, of class Funcionario.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Funcionario instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Funcionario.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Funcionario instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalario method, of class Funcionario.
     */
    @Test
    public void testGetSalario() {
        System.out.println("getSalario");
        Funcionario instance = null;
        double expResult = 0.0;
        double result = instance.getSalario();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalario method, of class Funcionario.
     */
    @Test
    public void testSetSalario() {
        System.out.println("setSalario");
        double salario = 0.0;
        Funcionario instance = null;
        instance.setSalario(salario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularIrpf method, of class Funcionario.
     */
    @Test
    public void testCalcularIrpf() {
        System.out.println("calcularIrpf");
        Funcionario instance = new Funcionario("teste", 850);
        double expResult = 0.0;
        double result = instance.calcularIrpf();
        assertEquals(expResult, result);
        assertEquals(0, new Funcionario("teste", 1903.98).calcularIrpf());
        assertEquals(0, new Funcionario("teste", 1903.99).calcularIrpf());
        
    }

    /**
     * Test of identificarFaixaIrpf method, of class Funcionario.
     */
    @Test
    public void testIdentificarFaixaIrpf() {
        System.out.println("identificarFaixaIrpf");
        Funcionario instance = new Funcionario("teste", 850);
        FaixaIrpf expResult = FaixaIrpf.PRIMEIRA;
        FaixaIrpf result = instance.identificarFaixaIrpf();
        assertEquals(expResult, result);
        assertEquals(FaixaIrpf.PRIMEIRA, new Funcionario("teste", 1903.98).identificarFaixaIrpf());
        assertEquals(FaixaIrpf.SEGUNDA, new Funcionario("teste", 1903.99).identificarFaixaIrpf());
    }
    
}
