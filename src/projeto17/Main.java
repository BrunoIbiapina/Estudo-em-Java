package projeto17;

public class Main {
    public static void main(String[] args) {
        Pessoas p1 = new Pessoas(999);

        p1.nome = "João";
        p1.cidade = "Teresina";
        // p1.cpf = 010;
        // p1.salario = 1000;

        p1.informacaoPessoa();
        p1.atualizarCpf(234);
        p1.informacaoPessoa();
    }

}
