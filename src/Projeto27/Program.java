package Projeto27;

public class Program {
    public static void main(String[] args) {
        Product produto = new Product();
        
        produto.setName("Bruno");
       System.out.println("Meu nome é: " + produto.getName());
        produto.setPrice(1.200);
        produto.getPrice();
        System.out.printf("Preco do produto é: %.2f%n", produto.getPrice());
        produto.getQuantity();
        System.out.println("A quantidade é" + produto.getQuantity());
    }
    
}
