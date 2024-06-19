import java.util.Locale;
import java.util.Scanner;
public class entrada05 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        try ( Scanner sc = new Scanner(System.in)){
        char x;
        int y;
        double z;
        x = sc.next().charAt(0);
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Os dados digitados são: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }
}
}
