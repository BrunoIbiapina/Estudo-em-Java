package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class repeticao07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número");
            double a = sc.nextDouble();
            System.out.println("Digite um número");
            double b = sc.nextDouble();
            System.out.println("Digite um número");
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("A média é: %.1f%n", media);

        }
        sc.close();
    }
}
