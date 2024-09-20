/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.q01;

import javax.swing.JOptionPane;

/**
 *
 * @author gbvanzuita
 */
public class App {
    static Funcionario[] vetor_funcionario = new Funcionario[5];
    static int qtFuncionario = 0;
    
    public static void main(String[] args) {
        while (qtFuncionario < 5) {            
            criarFuncionario();
        }
        String texto = "";
        for (Funcionario fn : vetor_funcionario) {
            texto += "Funcionario: "+fn.getNome()+", Salário: "+fn.getSalario()+", IRPF: "+fn.calcularIrpf()+"\n";
        }
        
        JOptionPane.showMessageDialog(null, texto);
    }
    
    public static Funcionario buscar(String nome) {
        if (qtFuncionario == 0) {
            return null;
        }
        for (Funcionario fn : vetor_funcionario) {
            if (fn != null) {
                if (fn.getNome().equals(nome)) {
                    return fn;
                }
            }
            
        }
        return null;
    }
    
    public static void criarFuncionario() {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome:");
        double salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o sálario:"));
        Funcionario selecionada = buscar(nome);
        
        if (selecionada != null) {
            JOptionPane.showMessageDialog(null, "Funcionario já cadastrado");
            return;
        }
        try {
            selecionada = new Funcionario(nome, salario);
        } catch (IllegalArgumentException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        
        vetor_funcionario[qtFuncionario] = selecionada;
        qtFuncionario++;
    }

}
