package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class condicional07 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Qual o seu salário: ");
            salario = sc.nextDouble();

        if(salario <= 2000.0){
            imposto = 0.0;
            System.out.println(" Você é isento de imposto de renda");
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.0) * 0.8;
            System.out.printf("Foi descontado em imposto o valor de R$: %.2f%n ", imposto);
            
        }
        else if (salario <= 4500.0) {
            imposto = ( salario - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("Foi descontado em imposto o valor de R$ %.2f%n ", imposto);
            
        }
        else{
            imposto = ( salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("Foi descontado em imposto o valor de R$: %.2f%n", imposto);
        }
        sc.close();

    }
    
}
