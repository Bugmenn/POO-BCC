/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10.q01;

/**
 *
 * @author gabri
 */
public class Circulo extends Figura{
    
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * (raio*raio);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }    
    
}
