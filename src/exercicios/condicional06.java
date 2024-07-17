package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class condicional06 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.println("Digite um valor qualquer:");
            valor = sc.nextDouble();
        if(valor >= 0.0 && valor <= 25.0){
            System.out.println("Dentro do intervalo 0,25");
        }
        else if(valor > 25 && valor <= 50){
            System.out.println("Dentro do intervalo 25,50");
    
        }
        else if(valor > 50 && valor <= 75){
            System.out.println("Dentro do intervalo 50,75");
        }
        else if(valor > 75 && valor <=100){
            System.out.println("Dentro do Intervalo 75,100");
        }
        else{
            System.out.println("Fora de intervalo");
        }
        sc.close();

    }
    
}
