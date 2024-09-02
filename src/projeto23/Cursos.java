package projeto23;

public class Cursos {
    private String nome;
    private int vagasDisponiveis;

    public Cursos(String nome, int vagasDisponiveis) {
        this.nome = nome;
        this.vagasDisponiveis = vagasDisponiveis;

    }

    public String getNome() {
        return nome;
    }
    public int getvagasDisponiveis(){
        return vagasDisponiveis;
    }

}
