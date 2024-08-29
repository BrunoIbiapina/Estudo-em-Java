package projeto15;

public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular", 200.00, 40, 2);

        produto1.exibirProduto();
        produto1.venderProduto(2);
        if(produto1.emEstoque()){
            System.out.println("Após a venda temos: " + produto1.quantidadeEmEstoque + " em estoque.");
        }
        else{
            System.out.println("Não temos em estoque.");
        }
    }
    
}
