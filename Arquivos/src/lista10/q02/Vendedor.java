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
public class Vendedor extends Funcionario{
    
    private double percentualComissao;
    private ArrayList<Venda> vendas = new ArrayList<>();

    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
    }    

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }
    
    public void incluirVenda(Venda v) {
        vendas.add(v);
    }
    
    @Override
    public double calcularSalario() {
        double salario = getSalarioBase();
        
        for (Venda venda : vendas) {
            salario += venda.getValor()*percentualComissao;
        }
        
        return salario;
    }
}
