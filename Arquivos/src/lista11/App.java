/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista11;

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        Contas contas = new Contas();
        
        ContaAgua contaAgua1 = new ContaAgua(2, 2);
        
        MensalidadeEnsino mensalidadeEnsino = new MensalidadeEnsino(3, 2);
        
        PrevidenciaPrivada previdenciaPrivada1 = new PrevidenciaPrivada();
        previdenciaPrivada1.setValor(100);
        previdenciaPrivada1.investir();
        
        contas.incluirConta(contaAgua1);
        contas.incluirConta(mensalidadeEnsino);
        contas.incluirConta(previdenciaPrivada1);
        
        double total = contas.calcularTotalContas();
        System.out.println(total);
    }
}
