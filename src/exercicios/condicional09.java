package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class condicional09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String dia;

        System.out.println("Digite uma data");
        x = sc.nextInt();

        switch (x) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";

                break;
            case 3:
                dia = "terça";

                break;
            case 4:
                dia = "quarta";

                break;
            default:
                dia = "invalido";
                break;

        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
