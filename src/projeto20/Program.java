package projeto20;

public class Program {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Item A", 50);

        estoque1.adicionarEstoque(100);
        estoque1.removerEstoque(30);
        estoque1.exibirInformacoes();
    }
    
}
