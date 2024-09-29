/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package lista9.q04;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabri
 */
public class ContaBancariaTest {
    
    public ContaBancariaTest() {
    }

    /**
     * Test of getNumero method, of class ContaBancaria.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", 0, titular);
        String expResult = "1";
        String result = instance.getNumero();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumero method, of class ContaBancaria.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "1";
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria(numero, 0, titular);
        instance.setNumero(numero);
    }

    /**
     * Test of getSaldo method, of class ContaBancaria.
     */
    @Test
    public void testGetSaldo() {
        System.out.println("getSaldo");
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", 0, titular);
        double expResult = 0;
        double result = instance.getSaldo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSaldo method, of class ContaBancaria.
     */
    @Test
    public void testSetSaldo() {
        System.out.println("setSaldo");
        double saldo = 1;
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", saldo, titular);
        instance.setSaldo(saldo);
    }

    /**
     * Test of getTitular method, of class ContaBancaria.
     */
    @Test
    public void testGetTitular() {
        System.out.println("getTitular");
        Cliente expResult = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", 0, expResult);
        Cliente result = instance.getTitular();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitular method, of class ContaBancaria.
     */
    @Test
    public void testSetTitular() {
        System.out.println("setTitular");
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", 0, titular);
        instance.setTitular(titular);
    }

    /**
     * Test of depositar method, of class ContaBancaria.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        double valor = 1;
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", valor, titular);
        instance.depositar(valor);
    }

    /**
     * Test of sacar method, of class ContaBancaria.
     */
    @Test
    public void testSacar() {
        System.out.println("sacar");
        double valor = 1;
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", valor, titular);
        instance.sacar(valor);
    }

    /**
     * Test of transferir method, of class ContaBancaria.
     */
    @Test
    public void testTransferir() {
        System.out.println("transferir");
        double valor = 1;
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria contaDestino = new ContaBancaria("1", valor, titular);
        ContaBancaria instance = new ContaBancaria("1", valor, titular);
        instance.transferir(contaDestino, valor);
    }

    /**
     * Test of getMovimentos method, of class ContaBancaria.
     */
    @Test
    public void testGetMovimentos() {
        System.out.println("getMovimentos");
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", 0, titular);
        ArrayList<Movimento> expResult = instance.getMovimentos();
        ArrayList<Movimento> result = instance.getMovimentos();
        assertEquals(expResult, result);
    }

    /**
     * Test of incluirMovimento method, of class ContaBancaria.
     */
    @Test
    public void testIncluirMovimento() {
        System.out.println("incluirMovimento");
        Movimento m = new Movimento(0, TipoMovimento.DEBITO);
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria instance = new ContaBancaria("1", 0, titular);
        instance.incluirMovimento(m);
    }
    
    /**
     * Conferir se o método sacar gera 
     * movimento de crédito e débito na conta bancária
     */
    @Test
    public void testeGeramentoMovimento() {
        Cliente titular = new Cliente("teste", "endereço");
        ContaBancaria conta = new ContaBancaria("1", 0, titular);
        conta.depositar(1000);
        conta.sacar(250);
        for (Movimento movimento : conta.getMovimentos()) {
            System.out.println(movimento.getValor()+"\n"+
                    movimento.getTipoMovimento()+"\n"+
                    movimento.getData().toString()+"\n"+
                    movimento.getHora().toString()+"\n");
        }
        
        Movimento movimento1 = conta.getMovimentos().get(0);
        double valor = movimento1.getValor();
        TipoMovimento tipo = movimento1.getTipoMovimento();
        assertEquals(1000, valor);
        assertEquals(TipoMovimento.CREDITO, tipo);
        
        Movimento movimento2 = conta.getMovimentos().get(1);
        double valor2 = movimento2.getValor();
        TipoMovimento tipo2 = movimento2.getTipoMovimento();
        assertEquals(250, valor2);
        assertEquals(TipoMovimento.DEBITO, tipo2);
    }
}
