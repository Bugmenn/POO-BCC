/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package RelacionamentoSimples;

/**
 *
 * @author gabri
 */
public class Ponto {
    private int x;
    private int y;
    
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

    public void setX(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("Valor X invalido");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws IllegalArgumentException {
        if (y < 0) {
            throw new IllegalArgumentException("Valor Y invalido");
        }
        this.y = y;
    }
}
