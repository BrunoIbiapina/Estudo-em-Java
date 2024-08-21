package projeto09;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public void exibirProduto() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preco produto: " + preco);
        System.out.println("Quantidade do produto: " + quantidade);

    }

    public void Venda(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso, quantidade em estoque PRODUO: " + nome + quantidade);
        } else {
            System.out.println("Quantidade insufisiente para a venda");
        }

    }

}
