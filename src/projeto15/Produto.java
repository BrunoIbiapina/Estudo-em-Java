package projeto15;

public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;
    int quantidadeVendida;

    public Produto(String nome, double preco, int quantidadeEmEstoque, int quantidadeVendida) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.quantidadeVendida = quantidadeVendida;
    }

    public void exibirProduto() {
        System.out.println("O nome do produto é: " + nome);
        System.out.println("O valor é: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
        System.out.println("Total vendido: " + quantidadeVendida);
        

    }

    public void venderProduto(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente, temos em estoque: " + quantidadeEmEstoque);
        }

    }

    public boolean emEstoque() {
        return quantidadeEmEstoque > 0;
    }

}
