package exercicios;
import java.util.Locale;
import java.util.Scanner;
public class entrada03 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        try( Scanner sc = new Scanner(System.in) ){
        double x;
        x = sc.nextDouble();
        System.out.println("Você digitou: " + x);


        }
    }

    
}
