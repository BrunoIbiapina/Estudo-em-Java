package estrutura_condicional;
import java.util.Scanner;

public class exemplo01 {
    public void main (String[] argts){

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if( hora < 12){
            System.out.println("Bom dia");
        }
        else if( hora < 18){
            System.out.println("Boa tarde");
        }
        else{
            System.out.println("Boa noite");
        }
            

    sc.close();
    }
}


