package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class repeticao01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            int x;

            System.out.println("Digite um valor X: ");
            x = sc.nextInt();

            int soma = 0;
            while (x != 0) {
                soma += x;
                x = sc.nextInt();

            }
            System.out.println(soma);

        }
    }
}
