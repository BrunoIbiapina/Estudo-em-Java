package Projeto30;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < vect.length; i++){
            sc.nextLine();
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(nome, price);
        }

        double soma = 0.0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i].getPreco();
        }
        double media = soma / vect.length;
        System.out.printf("A média dos precos é %.2f%n", media);

        
        

        sc.close();
    }
    
}
