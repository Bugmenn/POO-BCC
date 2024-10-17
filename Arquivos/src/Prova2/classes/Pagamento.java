/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova2.classes;

/**
 *
 * @author gbvanzuita
 */
public class Pagamento {
    
    private MetodoPagamento metodo;    
    private Pedido pedido;

    public Pagamento(Pedido pedido, MetodoPagamento metodo) {
        setMetodo(metodo);
        setPedido(pedido);
    }
    
    public double calcularTotalPagar() {
        double desconto = metodo.calcularDesconto(pedido);
        return pedido.calcularValorPedido() - desconto;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public void setMetodo(MetodoPagamento metodo) {
        if (metodo == null) {
            throw new IllegalArgumentException("Valor para o campo metodo está incorreto");
        }
        this.metodo = metodo;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Valor para o campo pedido está incorreto");
        }
        this.pedido = pedido;
    }    
    
}
