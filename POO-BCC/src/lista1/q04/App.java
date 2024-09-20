package lista1.q04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa vetor[] = new Pessoa[3];

        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Pessoa "+(i+1));
            System.out.print("Informe o nome: ");
            pessoa.nome = s.next();
            System.out.print("Informe a altura: ");
            pessoa.altura = s.nextDouble();
            System.out.print("Informe o peso: ");
            pessoa.peso = s.nextDouble();
            
            vetor[i] = pessoa;
        }

        s.close();
        
        for (int i = vetor.length-1; i > -1; i--) {
            Pessoa pessoa = vetor[i];
            System.out.println("Nome: "+pessoa.nome+"\nPeso: "+pessoa.peso+"\nAltura: "+pessoa.altura+"\nIMC: "+pessoa.calcularImc()+"\n");
        }
    }
}
