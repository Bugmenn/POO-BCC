package lista2.q01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa vetor[] = new Pessoa[3];

        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Pessoa "+(i+1));
            System.out.print("Informe o nome: ");
            pessoa.setNome(s.next());
            System.out.print("Informe a altura: ");
            pessoa.setAltura(s.nextDouble());
            System.out.print("Informe o peso: ");
            pessoa.setPeso(s.nextDouble());
            
            vetor[i] = pessoa;
        }

        s.close();
        
        for (int i = vetor.length-1; i > -1; i--) {
            Pessoa pessoa = vetor[i];
            System.out.println("Nome: "+pessoa.getNome()+"\nPeso: "+pessoa.getPeso()+"\nAltura: "+
                    pessoa.getAltura()+"\nIMC: "+pessoa.calcularImc()+"\n");
        }
    }
}
