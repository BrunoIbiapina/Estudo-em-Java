package exercícios;

import java.util.Locale;
import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();

        int[] vetor = new int[n];

        for(int i = 0; i < n; i ++){
            System.out.print("Digite um número:  ");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Números negativos: ");

        for( int i = 0; i < n; i++){
            if(vetor[i] < 0)
                System.out.printf("%d\n", vetor[i]);
        }
        sc.close();
    }
    
}
