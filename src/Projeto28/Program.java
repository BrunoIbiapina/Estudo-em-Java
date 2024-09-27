package Projeto28;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        ContaBancaria contabancaria;

        System.out.print("Digite sua conta bancaria: ");
        int numeroConta = sc.nextInt();

        System.out.print("Entre com sua conta: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Tem deposito inicial (S) ou (N)? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'S') {
            System.out.println("Digite o valor de deposito inicial");
            double depositoInicial = sc.nextDouble();
            contabancaria = new ContaBancaria(numeroConta, nomeCliente, depositoInicial);
        }
        else{
           contabancaria = new ContaBancaria(numeroConta, nomeCliente);
        }
        System.out.println();
        System.out.println("CONTA: ");
        System.out.println(numeroConta);

        System.out.println();
        System.out.println("Entre com o valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        contabancaria.deposito(valorDeposito);
        System.out.println("Atualizacao do deposito: ");
        System.out.println(contabancaria);

        System.out.println();
        System.out.println("Entre com o valor de saque: ");
        double saqueRealizado = sc.nextDouble();
        contabancaria.saqueRealizado(saqueRealizado);
        System.out.println("Atualizacao do deposito: ");
        System.out.println(contabancaria);
        sc.close();
    }

}
