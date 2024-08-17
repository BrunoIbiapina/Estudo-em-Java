
/*Exercício 3: 

Verificação de Paridade
Escreva um programa que receba um número inteiro e informe se ele é
par ou ímpar.
Exemplo:
Entrada: 6
Saída: Par */

package icevjava;

import java.util.Scanner;

public class exercicio03 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = sc.nextInt();
        int resultado = numero % 2;
        if (resultado == 0) {
            System.out.println("Par");

        } else {
            System.out.println("O número é Ímpar");
        }
    }

}
