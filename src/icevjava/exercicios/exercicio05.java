
/*
Exercício 5: Sequência de Fibonacci

Crie um algoritmo que gere a sequência de Fibonacci até o n-ésimo
termo. A sequência de Fibonacci é definida por F(0) = 0, F(1) = 1, e F(n) =
F(n-1) + F(n-2) para n > 1.

Exemplo:
Entrada: 6
Saída: [0, 1, 1, 2, 3,  */

package icevjava.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();
        // int list[] = { 0, 1 };
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);

        sc.close();
        for (int i = 1; i < numero; i++) {
            list.add(list.get(i) + list.get(i - 1));
        }
        System.out.println(list);

    }

}
