/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7A.model;

/**
 *
 * @author gbvanzuita
 */
public class Bairro {
    private String nome;
    private double coeficienteIptu;

    public Bairro(String nome, double coeficienteIptu) {
        setNome(nome);
        this.coeficienteIptu = coeficienteIptu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome deve ser informado");
        }
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) throws IllegalArgumentException {
        this.coeficienteIptu = coeficienteIptu;
    }
}
