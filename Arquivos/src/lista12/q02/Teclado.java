/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista12.q02;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Teclado {

    public Teclado() {
    }
    
    public int lerInt() {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o número inteiro:");
        try {
            int inteiro = Integer.parseInt(s.next());
            return  inteiro;
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido");
            lerInt();
        } finally {
            s.close();
        }
        return 0;
    }
    
    public double lerDouble() {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o número com ponto:");
        try {
            double numero = Double.parseDouble(s.next());
            return numero;
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido");
            lerDouble();
        } finally {
            s.close();
        }
        return 0;
    }
    
    public boolean lerBoolean() {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o boleano:");
        try {
            String texto = s.next();
            texto = texto.toLowerCase();
            switch (texto) {
                case "sim", "verdadeiro", "positivo", "s" -> {
                    return true;
                }
                case "nao", "falso", "negativo", "n" -> {
                    return false;
                }
                default -> throw new IllegalArgumentException("texto não valido");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            lerBoolean();
        } finally {
            s.close();
        }
        return false;
    }
    
    public String lerString() {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o texto:");
        String texto = s.next();
        s.close();
        return texto;
    }
}
