package projeto23;

public class Curso {
    private String nome;
    private int vagasDisponiveis;

    public Curso(String nome, int vagasDisponiveis) {
        this.nome = nome;
        this.vagasDisponiveis = vagasDisponiveis;
    }

    public String getNome() {
        return nome;
    }

    public int getVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void matricularAluno() {
        if (vagasDisponiveis > 0) {
            vagasDisponiveis--;
        } else {
            System.out.println("Não há vagas disponíveis para o curso: " + nome);
        }
    }

    public void cancelarMatricula() {
        vagasDisponiveis++;
    }

    @Override
    public String toString() {
        return nome + " (" + vagasDisponiveis + " vagas disponíveis)";
    }
}