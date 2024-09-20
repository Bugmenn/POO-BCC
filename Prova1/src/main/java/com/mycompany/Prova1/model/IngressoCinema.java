/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Prova1.model;

/**
 *
 * @author @author Gabriel Bugmann Vanzuita
 */
public class IngressoCinema {
    private DiaSemana diaSemana;
    private boolean estudante;
    
    /**
     * construtor do objeto
     * @param diaSemana variavel enum do arquivo DiaSemana
     * @param estudante boleano
     */
    public IngressoCinema(DiaSemana diaSemana, boolean estudante) {
        setDiaSemana(diaSemana);
        this.estudante = estudante;
    }

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DiaSemana diaSemana) throws IllegalArgumentException {
        if (diaSemana == null) {
            throw new IllegalArgumentException("Dia da Semana não pode ser vazio");
        }
        this.diaSemana = diaSemana;
    }

    public boolean getEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }
    
    /**
     * metodo para verificar o valor do ingresso
     * o botão para realizar o metodo é o jBtnVerificarValor ou "Verificar valor"
     * @return retorna o valor
     */
    public float precoIngresso(){
        float valorIngresso = 15;
        if (estudante && (diaSemana.equals(DiaSemana.SEGUNDA) || diaSemana.equals(DiaSemana.SEXTA) || diaSemana.equals(DiaSemana.SABADO) || diaSemana.equals(DiaSemana.DOMINGO))) {
            valorIngresso -= valorIngresso*0.3;
        }
        if (diaSemana.equals(DiaSemana.TERCA) || diaSemana.equals(DiaSemana.QUARTA) || diaSemana.equals(DiaSemana.QUINTA)) {
            valorIngresso *= 0.5;
        }
        if (diaSemana.equals(DiaSemana.SABADO) || diaSemana.equals(DiaSemana.DOMINGO)) {
            valorIngresso += valorIngresso*0.4;
        }
        return valorIngresso;
    }
}
