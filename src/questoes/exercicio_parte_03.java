package questoes;

public class exercicio_parte_03{
public static void main(String[] args){
    Double A ,B, C, Pi, ResultadoA, ResultadoB, ResultadoC; 

    
    A = 2.0;
    B = 100.64;
    C = 150.0;
    Pi = 3.141519;
   ResultadoA = Pi * Math.pow(A,2);
System.out.printf("%.4f%n",ResultadoA);
   ResultadoB = Pi * Math.pow(B,2);
System.out.printf("%.4f%n",ResultadoB);
   ResultadoC = Pi * Math.pow(C,2);
System.out.printf("%.4f%n", ResultadoC);
}

}
