package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class debug {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double largura;
            largura = sc.nextDouble();
            double comprimento;
            comprimento = sc.nextDouble();
            double metroQuadrado;
            metroQuadrado = sc.nextDouble();
            double area;
            area = largura * comprimento;
            double preco;
            preco = area * metroQuadrado;

            System.out.printf("AREA = %.2f%n", area);
            System.out.printf("PRECO = %.2f%n", preco);

            sc.close();
        }
    }


