/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2.classes;

/**
 *
 * @author gbvanzuita
 */
public class Dinheiro implements MetodoPagamento{
    
    private double valor;

    public Dinheiro(double valor) {
        setValor(valor);
    }
    
    @Override
    public double calcularDesconto(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("pedido vazio");
        }
        return pedido.calcularValorPedido() * 0.1;
    }
    
    @Override
    public double calcularTroco(double valorPedido) {
        if (valorPedido <= 0) {
            throw new IllegalArgumentException("Valor para o campo valor pedido está incorreto");
        }
        if (valor <= valorPedido)
            return 0;
        else
            return valor - valorPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor para o campo valor está incorreto");
        }
        this.valor = valor;
    }
    
}
