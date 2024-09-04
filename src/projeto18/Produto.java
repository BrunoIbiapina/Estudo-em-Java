package projeto18;

public class Produto {
    public String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.println("O produto é: " + nome);

    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem >= 10 && porcentagem <= 90) {
            double desconto = porcentagem / 100;
            preco = preco - (preco * desconto);
            System.out.println("Valor do produto com desconto fica " + preco);
            System.out.println("O desconto é de : " + (preco * desconto));

        } else {
            System.out.println("Valor invalido");
        }

    }

    public double getPreco() {
        return this.preco;
    }
    public String getNome(){
        return this.nome;
    }
}
