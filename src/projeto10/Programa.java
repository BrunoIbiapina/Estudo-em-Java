package projeto10;

public class Programa {
    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", "Pastor", 10);
        Animal animal2 = new Animal("Gato", "Sem raca", 3);

        animal.exibirAnimal();
        animal.aniversario();
        animal.exibirAnimal();

        animal2.exibirAnimal();
        animal2.aniversario();
        animal.exibirAnimal();

        if (animal.ehAdulto()) {
            System.out.println("O cachorro 1 é adulto.");
        } else {
            System.out.println("O cachorro não é adulto.");

        }
        if (animal2.ehAdulto()) {
            System.out.println("O cachorro 1 é adulto.");
        } else {
            System.out.println("O gato não é adulto.");

        }

    }
}
