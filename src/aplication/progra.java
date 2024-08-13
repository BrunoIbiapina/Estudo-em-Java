package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class progra {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite os valores do triangulo X. ");
        System.out.println("Digite os valores do triangulo xA: ");
        x.a = sc.nextDouble();
        System.out.println("Digite os valores do triangulo xB: ");
        x.b = sc.nextDouble();
        System.out.println("Digite os valores do triangulo xC: ");
        x.c = sc.nextDouble();

        System.out.println("Digite os valores do triangulo Y. ");
        System.out.println("Digite os valores do triangulo yA: ");
        y.a = sc.nextDouble();
        System.out.println("Digite os valores do triangulo yB: ");
        y.b = sc.nextDouble();
        System.out.println("Digite os valores do triangulo yC: ");
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A área do triangulo X é: %.4f%n", areaX);
        System.out.printf("A área do triangulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área é a X");
        } else {
            System.out.println("Maior área é a Y");
        }

        sc.close();

    }
}
