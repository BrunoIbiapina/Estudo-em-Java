package projeto18;

public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular",1000);

        produto1.nome = "Apple";
       
         System.out.println(produto1.getPreco());
         System.out.println(produto1.getNome());
        
        produto1.aplicarDesconto(10);
        produto1.exibirInformacoes();

    }
    
}
