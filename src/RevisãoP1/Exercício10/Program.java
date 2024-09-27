package RevisãoP1.Exercício10;

public class Program {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro();
        Vendedor vendedor = new Vendedor();

        engenheiro.calcularSalario();;
        engenheiro.exibirDetalhes();
        System.out.println();
        vendedor.calcularSalario();
        vendedor.exibirDetalhes();

    }
}
