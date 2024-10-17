/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2.classes;

/**
 *
 * @author gbvanzuita
 */
public interface MetodoPagamento {
    
    public double calcularDesconto(Pedido pedido);
    
    public double calcularTroco(double valorPedido);
}
