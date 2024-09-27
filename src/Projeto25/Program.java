package Projeto25;

public class Program {
    public static void main(String[] args) {
        DobradorAr aang = new DobradorAr();
        DobradorAgua katara = new DobradorAgua();

        aang.nome = "Aang";
        aang.nacao = "Nomades do Ar";

        katara.nome = "Katara";
        katara.nacao = "Tribo da água";

        aang.apresentacao();
        aang.dobrarAR();

        katara.apresentacao();
        katara.DobradorAgua();
       
    }
}
