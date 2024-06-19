import java.util.Scanner;
public class entrada04 {
    public static void main(String[] args){
       try (Scanner sc = new Scanner(System.in)){
        char x;
        x = sc.next().charAt(0);
        System.out.println("A primeira letra digitada foi: " + x);
     }
    }
}
