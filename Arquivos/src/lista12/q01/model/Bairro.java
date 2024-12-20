/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista12.q01.model;

/**
 *
 * @author gbvanzuita
 */
public class Bairro {
    private String nome;
    private double coeficienteIptu;

    public Bairro(String nome, double coeficienteIptu) {
        this.nome = nome;
        this.coeficienteIptu = coeficienteIptu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if (coeficienteIptu <= 0)
            throw new IllegalArgumentException("Valor coeficiente invalido");
        
        this.coeficienteIptu = coeficienteIptu;
    }    
}
