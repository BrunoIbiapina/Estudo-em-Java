package projeto09;

import java.util.Locale;

public class Vendas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto produto = new Produto("Cerveja", 40.00, 50);
        Produto produto2 = new Produto("Vinho", 60.00, 50);

        produto.exibirProduto();
        produto2.exibirProduto();

        produto.Venda(20);
        produto2.Venda(2);

        produto.exibirProduto();
        produto2.exibirProduto();

        produto.Venda(70);

    }
}
