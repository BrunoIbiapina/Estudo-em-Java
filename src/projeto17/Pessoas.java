package projeto17;

public class Pessoas {
    public String nome;
    public String cidade;
    private int cpf;
    private double salario;

    public Pessoas(int cpf) {
        this.cpf = cpf;

    }

    public void informacaoPessoa() {
        System.out.println("Informcao das pessoas");
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Cpf: " + cpf);
        System.out.println("Salario: " + salario);
        System.out.println();
        subirDecargo();
    }

    private void subirDecargo() {
        System.out.println("Subiu de cargo.");
        System.out.println("");
        salario += 500;

    }

    public void atualizarCpf(int cpf) {
        System.out.println("CPF atualizado: ");
        System.out.println();
        this.cpf = cpf;
    }
}
