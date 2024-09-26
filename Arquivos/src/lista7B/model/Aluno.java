/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7B.model;

/**
 *
 * @author gbvanzuita
 */
public class Aluno {
    private String nome;
    private int numero_matricula;

    public Aluno(String nome, int numero_matricula) {
        setNome(nome);
        setNumero_matricula(numero_matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Aluno deve possuir nome");
        }
        this.nome = nome;
    }

    public int getNumero_matricula() {
        return numero_matricula;
    }

    public void setNumero_matricula(int numero_matricula) throws IllegalArgumentException {
        if (numero_matricula < 1) {
            throw new IllegalArgumentException("Valor de matricula invalido");
        }
        this.numero_matricula = numero_matricula;
    }    
}
