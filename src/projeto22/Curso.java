package projeto22;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    public String titulo;
    private int duracaoHoras;
    private int vagasDisponiveis;
    private List<String> alunosMatriculados;

    public Curso(String titulo, int duracaoHoras, int vagasDisponiveis) {
        this.titulo = titulo;
        this.duracaoHoras = duracaoHoras;
        this.vagasDisponiveis = vagasDisponiveis;
        this.alunosMatriculados = new ArrayList<>();

    }

    public void matricularAluno() {
        Scanner entrada = new Scanner(System.in);
        if (vagasDisponiveis > 0) {
            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = entrada.nextLine();
            System.out.print("Digite o curso que o aluno deseja fazer: ");
            String cursoDesejado = entrada.nextLine();

            alunosMatriculados.add(nomeAluno + " - Curso: " + cursoDesejado);
            vagasDisponiveis--;
            System.out.println("Aluno " + nomeAluno + " matriculado com sucesso no curso " + cursoDesejado
                    + ". Vagas restantes: " + vagasDisponiveis);

        } else {
            System.out.println("Não há vagas disponíveis.");
        }
    }

    public void cancelarMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do aluno que deseja cancelar a matrícula: ");
        String nomeAluno = entrada.nextLine();

        boolean removed = alunosMatriculados.removeIf(aluno -> aluno.startsWith(nomeAluno));
        if (removed) {
            vagasDisponiveis++;
            System.out.println("Matrícula do aluno " + nomeAluno + " cancelada com sucesso. Vagas disponíveis: "
                    + vagasDisponiveis);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public int getvagasTotal() {
        return this.vagasDisponiveis;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do curso: " + titulo);
        System.out.println("Duração: " + duracaoHoras + " horas");
        System.out.println("Vagas disponíveis: " + getvagasTotal());
        System.out.println("Alunos matriculados: ");
        for (String aluno : alunosMatriculados) {
            System.out.println(aluno);
        }
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