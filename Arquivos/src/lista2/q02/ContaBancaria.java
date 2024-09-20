package lista2.q02;

public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("O número da conta informado é invalido");
        }
        this.numero = numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    /**
     * adiciona valor a conta
     * @param valor valor em questão
     */
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo");
        }
        this.saldo += valor;
    }
    
    /**
     * retira o valor da conta
     * @param valor valor em questão
     */
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo");
        } else if (this.saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    /**
     * transfere um valor da conta objeto atual para a conta destino
     * @param contaDestino conta a receber o valor
     * @param valor o valor em questão
     */
    public void transferir(ContaBancaria contaDestino, double valor) {
        if (contaDestino == null) {
            throw new IllegalArgumentException("A conta não existe");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
