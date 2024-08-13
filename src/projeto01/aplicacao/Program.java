package projeto01.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import projeto01.entidades.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println(" Dados do produto: ");
        System.out.print("Nome do produto: ");
        product.name = sc.nextLine();
        System.out.print("Preço do produto: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantity = sc.nextInt();

        System.out.println(" ");
        System.out.println("Tipode de produto: " + product);

        System.out.println(" ");
        System.out.print("Entre com a quantidade de produto no estoque: ");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println(" ");
        System.out.print("Atualizado: " + product);

        System.out.println(" ");
        System.out.print("Entre com a quantidade de saída produto no estoque: ");
        quantity = sc.nextInt();
        product.RemoveProduct(quantity);

        System.out.println(" ");
        System.out.print("Atualizado: " + product);

        sc.close();
    }

}
