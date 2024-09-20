/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package lista7A.model;

/**
 *
 * @author gbvanzuita
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;
    
    public Imovel(String endereco, int area) {
        this.endereco = endereco;
        this.area = area;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public int getArea() {
        return area;
    }

    public void setArea(int area) throws IllegalArgumentException {
        if (area < 0) {
            throw new IllegalArgumentException("Valor de área invalido");
        }
        this.area = area;
    }
    
    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public double calcularIptu() throws IllegalArgumentException {
        
        if (bairro == null) {
            throw new IllegalArgumentException("Impossivel calcular sem informar bairro");
        } else if (finalidade == null) {
            throw new IllegalArgumentException("Finalidade não informada");
        }
        
        double iptu;
        
        switch (finalidade) {
            case RESIDENCIAL:
                iptu = 1*area;
                break;
                
            case COMERCIAL:
                if (area <= 100) {
                    iptu = 500;
                } else if (area > 100 && area <= 400) {
                    iptu = 1000;
                } else {
                    iptu = 2.55*area;
                }
                break;
                
            case INDUSTRIAL:
                if (area <= 2000) {
                    iptu = 1000;
                } else {
                    iptu = 0.55*area;
                }
                break;
                
            default:
                throw new AssertionError();
        }
        
        return iptu*bairro.getCoeficienteIptu();
    }
}
