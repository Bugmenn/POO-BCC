/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2.classes;

/**
 *
 * @author gbvanzuita
 */
public class Cartao implements MetodoPagamento{
    
    private double saldo;

    public Cartao(double saldo) {
        setSaldo(saldo);
    }
    
    @Override
    public double calcularDesconto(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Valor para o campo pedido está incorreto");
        }
        return pedido.calcularValorPedido() * 0.05;
    }
    
    @Override
    public double calcularTroco(double valorPedido) {
        if (valorPedido <= 0) {
            throw new IllegalArgumentException("Valor para o campo valor pedido está incorreto");
        }
        return 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo <= 0) {
            throw new IllegalArgumentException("Valor para o campo saldo está incorreto");
        }
        this.saldo = saldo;
    }
    
    
}
