package exercicios;


import java.util.Locale;

public class tempetatura {
    public static void main(String[] args) {
        double C, F, K, Re, Ra;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        Locale.setDefault(Locale.US);
        System.out.printf("A temperatura em F é %.2f\n", F);
        System.out.printf("A temperatura em K é %.2f\n", K);
        System.out.printf("A temperatira em Ra é %.2f\n", Ra);
        System.out.printf("A temperatura em Re é %.2f\n", Re);

    }
}
