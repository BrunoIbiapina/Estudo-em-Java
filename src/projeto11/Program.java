package projeto11;

public class Program {
    public static void main(String[] args) {
        Carro carro = new Carro("Wolks", "Polo", 1932);

        carro.exibirCarro();
        if (carro.ehNovo()) {
            System.out.println("O carro é novo.");
        } else {
            System.out.println("Carro não é novo");
        }

    }

}
