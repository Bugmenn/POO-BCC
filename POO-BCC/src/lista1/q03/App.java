package lista1.q03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Pessoa "+(i+1));
            System.out.print("Informe a altura: ");
            pessoa.altura = s.nextDouble();
            System.out.print("Informe o peso: ");
            pessoa.peso = s.nextDouble();

            System.out.println("IMC: "+pessoa.calcularImc());    
        }

        s.close();
    }
}
