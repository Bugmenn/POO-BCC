/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package RelacionamentoSimples;

/**
 *
 * @author gbvanzuita
 */
public class Retangulo {

    private Ponto pontoEsquerdoSup;
    private Ponto pontoDireitoInf;

    public Retangulo(Ponto pontoEsquerdoSup, Ponto pontoDireitoInf) {
        this.pontoEsquerdoSup = pontoEsquerdoSup;
        this.pontoDireitoInf = pontoDireitoInf;
    }    
    
    public int calcularArea() {
        int base = pontoDireitoInf.getX() - pontoEsquerdoSup.getX();
        int altura = pontoEsquerdoSup.getY() - pontoDireitoInf.getY();
        return base * altura;
    }
    
    public int calcularPerimetro() {        
        int base = pontoDireitoInf.getX() - pontoEsquerdoSup.getX();
        int altura = pontoEsquerdoSup.getY() - pontoDireitoInf.getY();
        return altura * 2 + base * 2;
    }
}
