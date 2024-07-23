package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class repeticao08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println("Digite um número");
            int x = sc.nextInt();
            System.out.println("Digite um número");
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisão impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }

        }
        sc.close();
    }

}
