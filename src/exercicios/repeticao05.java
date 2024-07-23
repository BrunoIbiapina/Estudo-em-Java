package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class repeticao05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número: ");
            int X = sc.nextInt();
            soma = soma + X;

        }
        System.out.println(soma);

        sc.close();

    }

}
