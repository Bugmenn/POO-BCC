/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4;

import javax.swing.JOptionPane;

/**
 *
 * @author gbvanzuita
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
        int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura"));
        int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o comprimento"));
        Retangulo retangulo = new Retangulo();
        try {
            retangulo.setAltura(altura);
            retangulo.setComprimento(comprimento);
        } catch (IllegalArgumentException error) {
            JOptionPane.showMessageDialog(null, error.getMessage());
        }
        
        JOptionPane.showMessageDialog(null, "Perimetro: "+retangulo.calcularPerimetro()+"\nÁrea: "+retangulo.calcularArea());
    }
}
