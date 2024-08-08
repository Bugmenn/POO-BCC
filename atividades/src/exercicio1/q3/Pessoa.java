package exercicio1.q3;

public class Pessoa {
    public double altura;
    public double peso;

    public double calcularImc() {
        return this.peso/(this.altura*this.altura);
    }
}
