/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntroGUI;

import javax.swing.JOptionPane;

/**
 *
 * @author gbvanzuita
 */
public class IntroGUI {
    static int qtContas = 0;
    static ContaBancaria[] contas = new ContaBancaria[10];
    
    public static void main(String[] args) {
        int comando;
        boolean executar = true;
        do {            
            comando = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção:\n1-Cadastrar\n2-Sacar\n3-Depositar\n4-Sair"));
            switch (comando) {
                case 1:
                    criarConta();
                    break;
                    
                case 2:
                    sacar();
                    break;
                    
                case 3:
                    depositar();
                    break;
                    
                case 4:
                    executar = false;
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Comando invalido");
            }
        } while (executar);
    }
    
    public static ContaBancaria buscar(String numero) {
        if (qtContas == 0) {
            return null;
        }
        for (ContaBancaria cb : contas) {
            if (cb != null) {
                if (cb.getNumero().equals(numero)) {
                    return cb;
                }
            }
            
        }
        return null;
    }
    
    public static void criarConta() {
        String titular = JOptionPane.showInputDialog(null, "Informe o nome do titular");
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        
        if (selecionada != null) {
            JOptionPane.showMessageDialog(null, "Conta já cadastrada");
            return;
        }
        try {
            selecionada = new ContaBancaria(numero, titular);
        } catch (IllegalArgumentException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        
        contas[qtContas] = selecionada;
        qtContas++;
    }
    
    public static void sacar() {
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null) {
            JOptionPane.showMessageDialog(null, "Conta não existe");
            return;
        }
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do saque"));
        try {
            selecionada.sacar(valor);
        } catch (IllegalArgumentException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        JOptionPane.showMessageDialog(null, "O saldo atual é: "+selecionada.getSaldo());
    }
    
    public static void depositar() {
        String numero = JOptionPane.showInputDialog(null, "Informe o numero da conta");
        ContaBancaria selecionada = buscar(numero);
        if (selecionada == null) {
            JOptionPane.showMessageDialog(null, "Conta não existe");
            return;
        }
        
        double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do deposito"));
        try {
            selecionada.depositar(valor);
        } catch (IllegalArgumentException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        JOptionPane.showMessageDialog(null, "O saldo atual é: "+selecionada.getSaldo());
    }
}
