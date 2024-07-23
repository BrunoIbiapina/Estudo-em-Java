package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class repeticao04 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o código: ");
        int codigo = sc.nextInt();

        while (codigo != 4) {

            if (codigo == 1){
                alcool = alcool + 1;
            } else if (codigo == 2) {
                gasolina = gasolina + 1;
            } else if (codigo == 3) {
                diesel = diesel + 1;
            } else {
                System.out.println("Código inválido. Tente novamente.");
            }

            System.out.println("Digite o código: ");
            codigo = sc.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();

    }
}
