package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class repeticao03 {
    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite a coordenada 1: ");
        x = sc.nextDouble();

        System.out.println("Digite a cordenada 2: ");
        y = sc.nextDouble();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }

            System.out.println("Digite a coordenada 1: ");
            x = sc.nextDouble();

            System.out.println("Digite a cordenada 2: ");
            y = sc.nextDouble();

        }
        System.out.println("Encerrado");
        sc.close();

    }

}
