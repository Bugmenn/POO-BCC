package exercicio1.q3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        for (int i = 0; i < 3; i++) {
            System.out.println("Pessoa"+(i+1));
            System.out.print("Informe a altura: ");
            pessoa.altura = s.nextDouble();
            System.out.print("Informe o peso: ");
            pessoa.peso = s.nextDouble();

            System.out.println("IMC: "+pessoa.calcularImc());    
        }

        s.close();
    }
}
