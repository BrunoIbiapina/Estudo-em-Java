package projeto04.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import projeto04.entidades.Product;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Digite nome do Aluno: ");
        product.nome = sc.nextLine();
        System.out.println("Digite a primeira nota: ");
        product.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        product.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        product.nota3 = sc.nextDouble();

        System.out.printf("FINAL PRIMEIRO SEMESTRE: %.2f%n", product.primeiroSimestre());

        if (product.primeiroSimestre() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f%n", product.faltandoParaPassar());

        } else {
            System.out.println("PASS");
        }
        sc.close();

    }

}
