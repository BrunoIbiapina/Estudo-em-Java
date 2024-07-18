package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class condicional08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double valor = 50.00;
        double valorconta;

        System.out.println("Digite valor de minutos: ");
            minutos = sc.nextInt();

        if(minutos <= 100){
            valorconta = valor;
            System.out.printf("O valor da sua conta é de R$ %.2f%n ", valor);
        }
        else{
            valorconta = valor + (minutos - 100) * 2.0;
            System.out.printf("O valor da sua conta é de R$ %.2f%n ", valorconta);
        }
        sc.close();
        }
    }

    

