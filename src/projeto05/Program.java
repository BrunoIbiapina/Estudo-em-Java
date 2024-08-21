package projeto05;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Digite o valor do RAIO: ");
        double raio = sc.nextDouble();

        double c = calc.circumference(raio);

        double v = calc.volume(raio);

        System.out.printf("Circumference: %.2f%n ", c);
        System.out.printf("Volume: %.2f%n ", v);
        System.out.printf("Circumference: %.2f%n ", calc.PI);

        sc.close();
    }

}
