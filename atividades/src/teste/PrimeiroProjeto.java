package teste;

public class PrimeiroProjeto {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno();
        aluno.nome = "Gabriel";
        aluno.idade = 19;
        System.out.println("Nome do aluno: "+aluno.nome+"\nIdade: "+aluno.idade);
        System.out.println(aluno.textoApresentacao());
    }
}
