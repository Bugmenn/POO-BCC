/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7B.model;

/**
 *
 * @author gbvanzuita
 */
public class Professor {
    private String nome;
    private NivelEstudo nivelEstudo;

    public Professor(String nome, NivelEstudo nivelEstudo) {
        setNome(nome);
        this.nivelEstudo = nivelEstudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Professor deve possuir nome");
        }
        this.nome = nome;
    }

    public NivelEstudo getNivelEstudo() {
        return nivelEstudo;
    }

    public void setNivelEstudo(NivelEstudo nivelEstudo) {
        this.nivelEstudo = nivelEstudo;
    }
    
    
}
