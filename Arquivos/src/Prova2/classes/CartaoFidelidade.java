/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2.classes;

import Prova2.Enum.Categoria;

/**
 *
 * @author gbvanzuita
 */
public class CartaoFidelidade extends Cartao{

    public CartaoFidelidade(double saldo) {
        super(saldo);
    }
    
    @Override
    public double calcularDesconto(Pedido pedido) {
        if (pedido == null ) {
            throw new IllegalArgumentException("Valor para o campo prato está incorreto");
        }
        Boolean temSobremesa = false;
        double valor = 0;
        for (Prato prato : pedido.getPratos()) {
            if (prato.getCategoria() == Categoria.SOBREMESA) {
                temSobremesa = true;
            } else {
                valor += prato.getValor();
            }
        }
        
        return temSobremesa ? valor : valor*0.3;
    }
}
