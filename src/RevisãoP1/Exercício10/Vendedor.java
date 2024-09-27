package RevisãoP1.Exercício10;

public class Vendedor extends Funcionario {
    @Override
    public void calcularSalario() {
        System.out.println("Salário é 3.000");

    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Salário é muito baixo");
    }
}
