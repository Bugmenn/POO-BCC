package teste;

public class Aluno {
    public int idade;
    public String nome;

    public String textoApresentacao() {
        // this é para quando se tem mais de uma variavel com o mesmo nome
        // this vai pegar a informação do objeto e não dentro da função
        return "Meu nome é "+this.nome;
    }
}
