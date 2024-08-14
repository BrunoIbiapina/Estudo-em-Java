package icevjava;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = numero - 1; i > 0; i--) {
            numero *= i;

        }
        System.out.println(numero);
    }

}
