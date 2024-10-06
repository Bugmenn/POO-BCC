/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11;

/**
 *
 * @author gabri
 */
public class PrevidenciaPrivada extends Investimento{
    
    private double valor;
    
    @Override
    public double calcularValorPagar() {
        return this.getSaldo();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void investir() throws IllegalArgumentException{
        if (valor == 0)
            throw new IllegalArgumentException("Deve ter valor");
        this.setSaldo(valor + this.getSaldo());
        this.valor = 0;
    }
}
