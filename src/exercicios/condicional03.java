package exercicios;
import java.util.Scanner;

public class condicional03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A, B;
        
        System.out.println("Digite o número A: ");
            A = sc.nextInt();
        System.out.println("Digite número B: ");
            B = sc.nextInt();
            

        if( A % B == 0 || B % A == 0){
            System.out.println("São Multiplos");
        }
        else{
            System.out.println("Não são multiplos.");
        }
        sc.close();


    }

    
}
