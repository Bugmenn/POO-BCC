/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.model;

/**
 *
 * @author gabri
 */
public class Ponto {
    private int x;
    private int y;
    
    /**
     * construtor para inicar os valores em 0
     */
    public Ponto() {
        x = 0;
        y = 0;
    }

    /**
     * construtor do objeto ponto no qual seta os valores
     * @param x valor inteiro por meio de input
     * @param y valor inteiro por meio de input
     */
    public Ponto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
        
    /**
     * identifica em qual eixo o ponto está posicionado
     * @return retorna um enum com base nos valores de X e Y
     */
    public Quadrante identificarQuadrante() {
        if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        } else if (x > 0 && y > 0) {
            return Quadrante.PRIMEIRO;
        } else if (x < 0 && y < 0) {
            return Quadrante.TERCEIRO;
        } else if (x > 0 && y < 0) {
            return Quadrante.QUARTO;
        } else {
            return Quadrante.NENHUM;
        }
    }
    
    /**
     * metodo para verificar se o ponto está em cima do eixo X
     * @return retorna um boleano com se Y é 0
     */
    public boolean estaIncidindoSobreX() {
        return y == 0;
    }
    
    /**
     *
     * @return retorna um boleano com se X é 0
     */
    public boolean estaIncidindoSobreY() {
        return x == 0;
    }
    
    /**
     * metodo que calcula a distancia do ponto com outro
     * @param outroPonto objeto ponto recebido para medir a distancia
     * @return
     */
    public double calcularDistancia(Ponto outroPonto) {
        return Math.sqrt(((Math.pow(outroPonto.getX() - this.getX(), 2)) + (Math.pow(outroPonto.getY() - this.getY(), 2))));
    }
    
    /**
     *
     * @param p1 objeto ponto utilizado para medir distancia
     * @param p2 objeto ponto utilizado para medir distancia
     * @return
     */
    public static double calcularDistancia(Ponto p1, Ponto p2) {
        return Math.sqrt(((Math.pow(p1.getX() - p2.getX(), 2)) + (Math.pow(p1.getY() - p2.getY(), 2))));
    }
}
