
/* Desenvolva um algoritmo para verificar se um número n é primo. Um
número primo é um número maior que 1 que tem apenas dois divisores:
1 e ele mesmo.
Exemplo:
Entrada: 7
Saída: Primo */
package icevjava;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int divisores = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores++;
            }
        }
        if (divisores == 2) {
            System.out.println("Primo");
        } else {
            System.out.println("Não Primo");
        }
        sc.close();

    }
}
