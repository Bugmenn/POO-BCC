package calculadora;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setNum1(30);
        calculadora.setNum2(5);
        
        System.out.println("Soma: "+calculadora.soma());
        System.out.println("Subtração: "+calculadora.subtracao());
        System.out.println("Divisão: "+calculadora.divisao());
        System.out.println("Multiplicação: "+calculadora.multiplicacao());
    }
}
