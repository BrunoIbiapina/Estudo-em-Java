package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class condicional10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite valor: ");
            double preco = sc.nextDouble();
            double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

            System.out.println(desconto);

        }
    }
}
