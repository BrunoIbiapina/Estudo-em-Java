package RevisãoP1.Exercício03;

public class Program {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Bicicleta bicicleta = new Bicicleta();

        carro.Mover();
        carro.ligarMotor();

        bicicleta.Mover();
        bicicleta.pedalar();
    }
}
