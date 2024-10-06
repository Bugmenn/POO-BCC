/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10.q01;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {            
            System.out.println("""
                               Informe uma forma para calcular:
                               1-Retangulo
                               2-Quadrado
                               3-Triangulo
                               4-Circulo
                               5-Parar""");

            String escolha = s.next();

            switch (escolha) {
                case "1":
                    Retangulo(s);
                    break;

                case "2":
                    Quadrado(s);
                    break;

                case "3":
                    Triangulo(s);
                    break;
                    
                case "4":
                    Circulo(s);
                    break;
                    
                case "5":
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Não existe na lista!");
                    break;
            }

        }
        s.close();
    }

    private static void Retangulo(Scanner s) {
        System.out.print("Informe a altura:");
        int altura = s.nextInt();
        System.out.print("Informe a largura:");
        int largura = s.nextInt();
        Retangulo retangulo = new Retangulo(largura, altura);
        double area = retangulo.calcularArea();
        System.out.println("Área: "+area);
    }

    private static void Quadrado(Scanner s) {
        System.out.print("Informe a medida:");
        int medida = s.nextInt();
        Quadrado quadrado = new Quadrado(medida);
        double area = quadrado.calcularArea();
        System.out.println("Área: "+area);
    }

    private static void Triangulo(Scanner s) {
        System.out.print("Informe o 1° lado:");
        int lado1 = s.nextInt();
        System.out.print("Informe o 2° lado:");
        int lado2 = s.nextInt();
        System.out.print("Informe o 3° lado:");
        int lado3 = s.nextInt();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        double area = triangulo.calcularArea();
        System.out.println("Área: "+area);
    }

    private static void Circulo(Scanner s) {
        System.out.print("Informe o raio:");
        int raio = s.nextInt();
        Circulo circulo = new Circulo(raio);
        double area = circulo.calcularArea();
        System.out.println("Área: "+area);
    }
}
