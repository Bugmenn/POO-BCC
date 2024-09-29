/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista9.q02;

import lista9.q02.ContaEspecial;
import lista9.q02.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabri
 */
public class ContaEspecialTest {
    
    public ContaEspecialTest() {
    }

    /**
     * Test of getLimiteCredito method, of class ContaEspecial.
     */
    @Test
    public void testGetLimiteCredito() {
        System.out.println("getLimiteCredito");
        Cliente titular = new Cliente("teste", "endereço");
        ContaEspecial instance = new ContaEspecial(100, "2", 0, titular);
        double expResult = 100;
        double result = instance.getLimiteCredito();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLimiteCredito method, of class ContaEspecial.
     */
    @Test
    public void testSetLimiteCredito() {
        System.out.println("setLimiteCredito");
        double limiteCredito = 100;
        Cliente titular = new Cliente("teste", "endereço");
        ContaEspecial instance = new ContaEspecial(limiteCredito, "2", 0, titular);
        instance.setLimiteCredito(limiteCredito);
    }

    /**
     * Test of sacar method, of class ContaEspecial.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 50;
        Cliente titular = new Cliente("teste", "endereço");
        ContaEspecial instance = new ContaEspecial(100, "2", 0, titular);
        instance.sacar(valor);
    }
    
    @Test
    public void testSacarValorSuperiorASaldo() {
        Cliente titular = new Cliente("teste", "endereço");
        ContaEspecial contaEspecial = new ContaEspecial(100, "1", 0, titular);
        contaEspecial.depositar(20);
        contaEspecial.sacar(50);
        double expResult = -30;
        double result = contaEspecial.getSaldo();
        assertEquals(expResult, result);
    }
    
    /**
     * Testar se valor de saque pode ser maior que o saldo, porém menor que
     * o limite de credito
     */
    @Test
    public void testSacarValor2() {
        Cliente titular = new Cliente("teste", "endereço");
        ContaEspecial contaEspecial = new ContaEspecial(100, "1", 0, titular);
        contaEspecial.depositar(20);
        contaEspecial.sacar(120);
        double expResult = -100;
        double result = contaEspecial.getSaldo();
        assertEquals(expResult, result);
    }
    
    /**
     * Testar se o método sacar() impede saques superiores ao
     * saldo e limite de crédito 
     */
    @Test
    public void testSacarValor3() {
        Cliente titular = new Cliente("teste", "endereço");
        ContaEspecial contaEspecial = new ContaEspecial(100, "1", 0, titular);
        contaEspecial.depositar(20);
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                contaEspecial.sacar(120.01);
            }
        );
        
        String expResult = "Valor excede o limite de credito";
        String result = exception.getMessage();
        assertEquals(expResult, result);
    }
}
