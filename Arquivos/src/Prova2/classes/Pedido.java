/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2.classes;

import java.util.ArrayList;

/**
 *
 * @author gbvanzuita
 */
public class Pedido {
    
    private ArrayList<Prato> pratos = new ArrayList<>();
    
    public double calcularValorPedido() {
        double valor = 0;
        for (Prato prato : pratos) {
            valor += prato.getValor();
        }
        return valor;
    }
    
    public void incluirPrato(Prato prato) {
        if (prato == null) {
            throw new IllegalArgumentException("Valor para o campo prato está incorreto");
        }
        this.pratos.add(prato);
    }
    
    public void removerPrato(Prato prato) {
        if (prato == null) {
            throw new IllegalArgumentException("Valor para o campo prato está incorreto");
        }
        this.pratos.remove(prato);
    }
    
    public ArrayList<Prato> getPratos() {
        return pratos;
    }    
     
}
