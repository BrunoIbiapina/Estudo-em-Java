package icevjava.exercicios;

public class aula01 {
    public static void main(String[] args) {
        int numero = 9;
        float peso = 3.14115F;// Floar quando se tem mais que 8 casas decimais depois do ponto.
        double salario = 3500.50;// Double usado quando se tem apenas 2 casas decimais depois do ponto.
        char letra = 'B';
        boolean estudar = false;
        byte bt = 127; // máximo que ele consegue, no caso dessa variável.
        long numeroMuitogrande = 9008584938483L;// Número muitos grandes, quando se é usado essa variável.
        String nomeAluno = "Bruno";// Usado para armazenar texto, conjunto de caracteres.
        String nomeEmCaixaAlta = "Ibiapina";
        nomeAluno.toUpperCase();// Por letra maiúsculo.
        nomeEmCaixaAlta.toLowerCase();// Tudo documentação.

        System.out.println(nomeAluno.toUpperCase());
        System.out.println(nomeEmCaixaAlta.toLowerCase());
    }
}
