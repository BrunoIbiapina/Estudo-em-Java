package Projeto31;

public class Main {
    public static void main(String[] args){
        Geometria g = new Geometria();
        Pessoa maria = new Pessoa("Maria", 30);
        Pessoa joao = new Pessoa("Joao'");

        System.out.println("Área de um quadrado:" + g.calcularArea(8));
        System.out.println("Área de um retangulo:" + g.calcularArea(7, 6));
        System.out.println("Área de um retangulo:" + g.calcularArea(3, false));
        System.out.println("Área de um retangulo:" + maria.Pessoa());
        
    }
}
