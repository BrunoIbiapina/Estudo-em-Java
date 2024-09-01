package projeto22;

import java.util.Scanner;

public class Curso {
    public String titulo;
    private int duracaoHoras;
    private int vagasDisponiveis;

    public Curso(String titulo, int duracaoHoras, int vagasDisponiveis) {
        this.titulo = titulo;
        this.duracaoHoras = duracaoHoras;
        this.vagasDisponiveis = vagasDisponiveis;

    }

    public void matricularAluno() {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
            System.out.println("Aluno matriculado com sucesso. Vagas restantes: " + vagasDisponiveis);
        } else {
            System.out.println("Não há vagas");
        }

    }

    public void cancelarMatricula() {
        vagasDisponiveis++;
        System.out.println("Matrícula cancelada com sucesso. Vagas disponíveis: " + vagasDisponiveis);
    }

    public int getvagasTotal() {
        return this.vagasDisponiveis;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do curso: " + titulo);
        System.out.println("Duracão: " + duracaoHoras);
        System.out.println("Vagas disponíveis: " + getvagasTotal());
    }

    public void exibirMenu() {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Matricular Aluno");
            System.out.println("2 - Cancelar Matrícula");
            System.out.println("3 - Exibir Informações do Curso");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    matricularAluno();
                    break;
                case 2:
                    cancelarMatricula();
                    break;
                case 3:
                    exibirInformacoes();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }
        entrada.close();
    }
}