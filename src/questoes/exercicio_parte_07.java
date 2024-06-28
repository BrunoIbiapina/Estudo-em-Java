package questoes;

public class exercicio_parte_07 {
    public static void main(String[] args) {
        double ValorPorHoras, SalarioFuncionario;
        int NumeroDoFuncionario, HorasTrabalhadas;

        NumeroDoFuncionario = 1;
        HorasTrabalhadas = 200;
        ValorPorHoras = 20.50;
        SalarioFuncionario = HorasTrabalhadas * ValorPorHoras;
        System.out.printf("Valor de seu salário é R$ %.2f%n", SalarioFuncionario);
        System.out.println("Número funcionário é : " + NumeroDoFuncionario);
    }
}
