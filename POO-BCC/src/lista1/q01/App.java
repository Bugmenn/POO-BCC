package lista1.q01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.altura = 1.75;
        pessoa1.peso = 78;
        System.out.println("IMC: "+pessoa1.calcularImc());
        
        Pessoa pessoa2 = new Pessoa();
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a altura: ");
        pessoa2.altura = s.nextDouble();
        System.out.print("Informe o peso: ");
        pessoa2.peso = s.nextDouble();

        System.out.println("IMC: "+pessoa2.calcularImc());

        Pessoa pessoa3 = new Pessoa();
        for (int i = 0; i < 3; i++) {
            System.out.println("Pessoa"+(i+1));
            System.out.print("Informe a altura: ");
            pessoa3.altura = s.nextDouble();
            System.out.print("Informe o peso: ");
            pessoa3.peso = s.nextDouble();

            System.out.println("IMC: "+pessoa3.calcularImc());    
        }

        s.close();
    }
}
