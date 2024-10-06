/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10.q02;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Empresa {
    
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void incluirFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    public void removerFuncionario(Funcionario f) {
        funcionarios.remove(f);
    }
    
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public double calcularCustoSalario() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }
}
