/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista10.q02;

/**
 *
 * @author gabri
 */
public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("empresa");
        
        Funcionario vendedor1 = new Vendedor("Luiz", 1000, 0.1);
        ((Vendedor) vendedor1).incluirVenda(new Venda(200));
        ((Vendedor) vendedor1).incluirVenda(new Venda(100));
        
        Funcionario vendedor2 = new Vendedor("Paula", 1200, 0.07);
        ((Vendedor) vendedor2).incluirVenda(new Venda(500));
        ((Vendedor) vendedor2).incluirVenda(new Venda(350));
        ((Vendedor) vendedor2).incluirVenda(new Venda(280));
        
        Funcionario programador1 = new Programador("Julio", 1000);
        ((Programador) programador1).incluirLinguagem("C");
        ((Programador) programador1).incluirLinguagem("Java");
        
        Funcionario programador2 = new Programador("Ana", 1000);
        ((Programador) programador2).incluirLinguagem("Java");
        ((Programador) programador2).incluirLinguagem("C#");
        
        Funcionario programador3 = new Programador("Anderson", 1200);
        ((Programador) programador3).incluirLinguagem("Python");
        
        Funcionario funcionario1 = new Funcionario("José", 1000);
        
        Funcionario funcionario2 = new Funcionario("Maria", 1400);
        
        empresa.incluirFuncionario(vendedor1);
        empresa.incluirFuncionario(vendedor2);
        empresa.incluirFuncionario(programador1);
        empresa.incluirFuncionario(programador2);
        empresa.incluirFuncionario(programador3);
        empresa.incluirFuncionario(funcionario1);
        empresa.incluirFuncionario(funcionario2);
        
        double custo = empresa.calcularCustoSalario();
        System.out.println("Custo total: "+custo+"\n");
        
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            System.out.println("Nome: "+funcionario.getNome()+" Salario: "+funcionario.calcularSalario());
        }
        
        System.out.println("\n");
        
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            if (funcionario instanceof Vendedor)
                System.out.println("Nome: "+funcionario.getNome()+" Percentual de comissão: "+((Vendedor) funcionario).getPercentualComissao());
        }
        
        System.out.println("\n");
        
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            if (funcionario instanceof Programador) {
                String linguagens = "";
                for (String linguagem : ((Programador) funcionario).getLinguagens()) {
                    linguagens += linguagem+", ";
                }
                System.out.println("Nome: "+funcionario.getNome()+" Linguagens: "+linguagens);
            }

        }
    }
}
