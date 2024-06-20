package exercicios;
import java.util.Locale;

public class entrada08 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        int notaAluno01 = 99;
        int notaAluno02 = 80;
        int notaAluno03 = 53;

        int totalGeral = (notaAluno01 + notaAluno02 + notaAluno03) / 3;
        System.out.println(totalGeral);
    }
}
