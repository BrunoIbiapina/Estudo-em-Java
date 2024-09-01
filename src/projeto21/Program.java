package projeto21;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite nome do funcionário: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o valor do seu salário: ");
        double salario = entrada.nextDouble();

        Funcionario funcionario1 = new Funcionario(nome, salario);

        funcionario1.exibirDados();

        System.out.println("Digite a percentual de aumento do salário: ");
        double percentual = entrada.nextDouble();

        funcionario1.aumentarSalario(percentual);
        System.out.println();
        System.out.println("Dados funcionario após aumento: ");
        System.out.println();
        funcionario1.exibirDadosTotal();
        

        entrada.close();
    }

}
