package exercicios;

import java.util.Scanner;

public class entradadados2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x;
            x = sc.nextInt();
            System.out.println("Você digitou: " + x);

        }
    }
}
