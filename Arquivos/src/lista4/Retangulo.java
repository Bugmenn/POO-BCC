/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

/**
 *
 * @author gbvanzuita
 */
public class Retangulo {

    private int altura;
    private int comprimento;
    
    public Retangulo() {
    }
    
    /**
     *
     * @param altura input da altura
     * @param comprimento input do comprimento
     */
    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) throws IllegalArgumentException  {
        if (altura <= 0) {
            throw new IllegalArgumentException("Valor incorreto para altura:" + altura);
        }
        this.altura = altura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) throws IllegalArgumentException {
        if (comprimento <= 0) {
            throw new IllegalArgumentException("Valor incorreto para comprimento:" + comprimento);
        }
        this.comprimento = comprimento;
    }
    
    /**
     * 
     * @return retorna o valor do perimetro (soma de todos os lados) 
     */
    public int calcularPerimetro() {
        return altura * 2 + comprimento * 2;
    }

    /**
     *
     * @return retorna o valor da área (base*altura)
     */
    public int calcularArea() {
        return comprimento * altura;
    }
}
