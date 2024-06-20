package exercicios;
import java.util.Scanner;
public class entradadados {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String x;
            x = sc.next();
            System.out.println("Você digitou:" + x);
        }
    }
}
