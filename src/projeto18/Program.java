package projeto18;

public class Program {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Celular",1000);

        produto1.nome = "Apple";
       
         System.out.println(produto1.getPreco());
         System.out.println(produto1.getNome());
        
        produto1.aplicarDesconto(20);
        produto1.exibirInformacoes();
        double desconto = 20.0 / 100;
        System.out.println("Valor desconto: " + (produto1.getPreco() * desconto));
        produto1.exibirInformacoes();

    }
    
}
