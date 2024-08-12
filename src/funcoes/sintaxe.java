package funcoes;

import java.util.Scanner;

public class sintaxe {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números");
        int numeroa = sc.nextInt();
        int numerob = sc.nextInt();
        int numeroc = sc.nextInt();

        if (numeroa > numerob && numeroa > numeroc) {
            System.out.println("O valor maior é o a");
        } else if (numerob > numeroc && numerob > numeroa) {
            System.out.println("O número maior é o b");
        } else {
            System.out.println("Número maior é o C = " + numeroc);
        }

        System.out.println();

        sc.close();

    }
}
