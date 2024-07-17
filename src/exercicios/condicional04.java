package exercicios;

import java.util.Scanner;

public class condicional04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;
        

        System.out.println("Digite a hora de inicio do jogo");
            inicio = sc.nextInt();
        System.out.println("Digite a hora do final do jogo");
            fim = sc.nextInt();
        
        if(inicio < fim){
            duracao = fim - inicio;
        }
        else{
            duracao = 24 - inicio + fim;
        }
        System.out.println("O jogo durou " + duracao + "Hora(s).");
        sc.close();
    }
    
}
