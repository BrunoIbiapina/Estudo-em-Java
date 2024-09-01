package projeto19;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Reserva reserva1 = new Reserva();

        System.out.println("Digite nome do cliente: ");
        reserva1.cliente = entrada.nextLine();
        System.out.println("Digite número do quarto: ");
        int numeroQuartos = entrada.nextInt();
        reserva1.reservar(numeroQuartos);
        reserva1.exibirInformacoes();

        entrada.close();

    }

}
