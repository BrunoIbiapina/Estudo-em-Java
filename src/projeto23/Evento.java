package projeto23;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    public String nome;
    private int duracaoDias;
    private int vagasDisponiveis;
    public String nomeCurso;
    private List<String> alunosMatriculados;
    private List<Curso> cursosDisponiveis;

    public Evento(String nome, int duracaoDias, int vagasDisponiveis) {
        this.nome = nome;
        this.duracaoDias = duracaoDias;
        this.vagasDisponiveis = vagasDisponiveis;
        this.alunosMatriculados = new ArrayList<>();
        this.cursosDisponiveis = new ArrayList<>();
    }

    public String toString() {
        return nome + " (" + vagasDisponiveis + " vagas disponíveis)";
    }

    public void adicionarCurso(Curso curso) {
        cursosDisponiveis.add(curso);
    }

    public void registrarParticipante() {
        Scanner entrada = new Scanner(System.in);
        if (vagasDisponiveis > 0) {
            System.out.println("Digite o nome da pessoa que pretende participar do evento: ");
            String nomeInscrito = entrada.nextLine();

            System.out.println("Digite um dos cursos que deseja se matricular: ");
            for (int i = 0; i < cursosDisponiveis.size(); i++) {
                System.out.println((i + 1) + " - " + cursosDisponiveis.get(i));
            }

            int escolha = entrada.nextInt();
            entrada.nextInt();

            if (escolha > 0 && escolha <= cursosDisponiveis.size()) {
                Curso cursoSelecionado = cursosDisponiveis.get(escolha - 1);
                cursoSelecionado.matricularAluno();
                alunosMatriculados.add(nomeInscrito + " - Curso: " + cursoSelecionado.getNome());
                vagasDisponiveis--;
                System.out.println("Aluno " + nomeInscrito + " matriculado no curso: " + cursoSelecionado.getNome());
                System.out.println("Vagas disponíveis restantes: " + vagasDisponiveis);

            } else {
                System.out.println("Escolha inválida.");
            }

        } else {
            System.out.println("Não temos vagas disponiveis.");
        }

    }

    public void cancelarRegistro() {
        Scanner entrada = new Scanner(System.in);
        if (!cursosDisponiveis.isEmpty()) {
            System.out.println("Escolha o curso do qual deseja cancelar a matrícula:");
            for (int i = 0; i < cursosDisponiveis.size(); i++) {
                System.out.println((i + 1) + " - " + cursosDisponiveis.get(i));
            }

            int escolha = entrada.nextInt();

            if (escolha > 0 && escolha <= cursosDisponiveis.size()) {
                Curso cursoSelecionado = cursosDisponiveis.get(escolha - 1);
                cursoSelecionado.matricularAluno();
                alunosMatriculados.add(nomeCurso + " - Curso: " + cursoSelecionado.getNome());
                System.out.println("Digite o nome do matriculado que deseja cancelar no curso "
                        + cursoSelecionado.getNome() + ": ");
                String nomeInscrito = entrada.nextLine();
                boolean removed = alunosMatriculados.removeIf(aluno -> aluno.startsWith(nomeInscrito));
                if (removed) {
                    cursoSelecionado.cancelarMatricula();
                    vagasDisponiveis++;
                    System.out.println("Matrícula cancelada para o aluno: " + nomeInscrito);
                    System.out.println("Vagas disponíveis agora: " + vagasDisponiveis);

                } else {
                    System.out.println("Aluno não encontrado.");
                }
            } else {
                System.out.println("Escolha inválida.");
            }
        } else {
            System.out.println("Não há cursos disponíveis.");

        }
    }

    public void mostrarDetalhes() {
        System.out.println("Evento: " + nome);
        System.out.println("Duração: " + duracaoDias + " dias");
        System.out.println("Cursos disponíveis:");
        for (Curso curso : cursosDisponiveis) {
            System.out.println(curso);
        }

        System.out.println("Alunos matriculados:");
        for (String aluno : alunosMatriculados) {
            System.out.println(aluno);
        }

    }

    public int getvagasTotal() {
        return this.vagasDisponiveis;
    }

    public void exibirMenu() {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Registrar participante");
            System.out.println("2 - Cancelar Participante");
            System.out.println("3 - Exibir Informações do Curso");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = entrada.nextInt();
            switch (opcao) {

                case 1:
                    registrarParticipante();
                    break;
                case 2:
                    cancelarRegistro();
                    break;
                case 3:
                    mostrarDetalhes();
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
