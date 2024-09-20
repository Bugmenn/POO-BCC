package lista1.q04;

public class Pessoa {
    public String nome;
    public double altura;
    public double peso;

    public double calcularImc() {
        return this.peso/(this.altura*this.altura);
    }
}
