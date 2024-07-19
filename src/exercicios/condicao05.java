package exercicios;

import java.util.Scanner;

public class condicao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total, quantidade, codigo;

        System.out.println("Qual o código que deseja digitar?");
        codigo = sc.nextInt();

        System.out.println("Qual a quantidade? ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            total = quantidade * 4.00;
            System.out.println("Seu código corresponde a um Cachorro quente e tem o preço total de: " + total);
        } else if (codigo == 2) {
            total = quantidade * 4.50;
            System.out.println("Seu código corresponde a um X.Salada e tem o preço total de: " + total);

        } else if (codigo == 3) {
            total = quantidade * 5.00;
            System.out.println("Seu código corresponde a um X-Bacon e tem o preço total de: " + total);

        } else if (codigo == 4) {
            total = quantidade * 2.00;
            System.out.println("Seu código corresponde a um Torrada Simples e tem o preço total de: " + total);
        } else {
            total = quantidade * 1.50;
            System.out.println(" Seu código corresponde a um Refrigerante e tem o preço total de: " + total);
        }
        sc.close();

    }

}
