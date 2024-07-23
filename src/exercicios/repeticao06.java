package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class repeticao06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite um número");
        double N = sc.nextDouble();

        int in = 0;
        int out = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Digite um número");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            } else {
                out = out + 1;
            }

        }

        System.err.println(in + " in ");
        System.err.println(out + " out ");
        sc.close();
    }
}
