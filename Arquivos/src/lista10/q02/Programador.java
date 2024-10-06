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
public class Programador extends Funcionario{

    private ArrayList<String> linguagens = new ArrayList<>();
    
    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }
    
    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }
    
    public ArrayList<String> getLinguagens() {
        return linguagens;
    }
    
    @Override
    public double calcularSalario() {
        double salario = 0;
        if (linguagens.contains("Java"))
            salario = this.getSalarioBase() * 0.2;
        
        return salario + this.getSalarioBase();
    }
}
