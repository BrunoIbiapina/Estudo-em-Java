package projeto07;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bruno", "Teresina", 30);
        Scanner entrada = new Scanner(System.in);
        pessoa.exibirInformacoes();
        pessoa.aniversario();
        System.out.println("Após o aniversário: ");
        pessoa.exibirInformacoes();

        Pessoa pessoa2 = new Pessoa();
        System.out.println("Digite nome da pessoa: ");
        pessoa2.nome = entrada.nextLine();
        System.out.println("Digite nome da cidade: ");
        pessoa2.cidade = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        pessoa2.idade = entrada.nextInt();

        pessoa2.exibirInformacoes();
        pessoa2.aniversario();
        System.out.println("Após o aniversário: ");
        pessoa2.exibirInformacoes();


        entrada.close();
    }
}
