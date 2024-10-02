package Projeto29;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for(int i = 0; i<n; i++){
            sum += vect[i];
        }
        double media = sum / n;

        System.out.printf("A média é: %.2f%n", media);

        sc.close();
    }

}