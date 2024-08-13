package aplication2;

import java.util.Locale;
import java.util.Scanner;

import entidade02.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quality in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println("Entre com o número produto para add estoque");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println();
        System.out.println("Produtos atualizados " + product);

        System.out.println();
        System.out.println("Entre com o número produto para sair estoque");
        quantity = sc.nextInt();
        product.RemoveProducts(quantity);

        System.out.println();
        System.out.println("Produtos atualizados " + product);

        sc.close();
    }

}
