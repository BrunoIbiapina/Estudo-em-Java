
/*
Exercício 2:

Fatorial de um Número
Implemente um algoritmo que calcule o fatorial de um número n. O
fatorial de n é o produto de todos os números inteiros positivos menores
ou iguais a n.
Exemplo:
Entrada: 5
Saída: 120 (pois 5! = 5 × 4 × 3 × 2 × 1)
*/

package icevjava;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        for (int i = numero - 1; i > 0; i--) {
            numero *= i;

        }
        System.out.println(numero);
    }

}
