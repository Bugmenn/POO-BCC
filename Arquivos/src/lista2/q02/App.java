package lista2.q02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String numeroConta1, numeroConta2, titularConta1, titularConta2;

        System.out.print("Informe o número da conta 1: ");
        numeroConta1 = s.next();
        System.out.print("Informe o titular da conta 1: ");
        titularConta1 = s.next();

        System.out.print("Informe o número da conta 2: ");
        numeroConta2 = s.next();
        System.out.print("Informe o titular da conta 2: ");
        titularConta2 = s.next();
        
        s.close();

        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumero(numeroConta1);
        conta1.setTitular(titularConta1);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.setNumero(numeroConta2);
        conta2.setTitular(titularConta2);

        conta1.depositar(1000);
        conta1.depositar(700);
        conta2.depositar(5000);
        conta2.transferir(conta1, 1800);

        System.out.println("Titular da conta "+conta1.getNumero()+" "+conta1.getTitular()+"\nSaldo"+conta1.getSaldo());
        System.out.println("Titular da conta "+conta2.getNumero()+" "+conta2.getTitular()+"\nSaldo"+conta2.getSaldo());
    }
}
