package projeto16;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(5.60); // Defina a cotação atual
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor que deseja dar em real: ");
        double valorReal = entrada.nextDouble();
        converter.exibirInformacoes(valorReal);

        System.out.println("Digite o valor que deseja dar em real: ");
        valorReal = entrada.nextDouble();
        converter.exibirInformacoes(valorReal);
        entrada.close();
    }
}