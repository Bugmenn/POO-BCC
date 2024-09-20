package lista1.q02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {        
        Pessoa pessoa = new Pessoa();
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a altura: ");
        pessoa.altura = s.nextDouble();
        System.out.print("Informe o peso: ");
        pessoa.peso = s.nextDouble();

        System.out.println("IMC: "+pessoa.calcularImc());

        s.close();
    }
}
