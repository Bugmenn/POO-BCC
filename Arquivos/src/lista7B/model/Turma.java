/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista7B.model;

import java.util.ArrayList;

/**
 *
 * @author gbvanzuita
 */
public class Turma {
    private String disciplina;
    private Turno turno;
    private ArrayList<Aluno> turma;
    private Professor professor;

    public Turma(String disciplina, Turno turno, ArrayList<Turma> turma, Professor professor) {
        this.disciplina = disciplina;
        this.turno = turno;
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) throws IllegalArgumentException {
        if (disciplina.isBlank()) {
            throw new IllegalArgumentException("Turma deve possuir o nome da disciplina");
        }
        this.disciplina = disciplina;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<Aluno> turma) {
        this.turma = turma;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
}
