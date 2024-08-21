package projeto10;

public class Animal {
    String nome;
    String especie;
    int idade;

    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;

    }

    public void exibirAnimal() {
        System.out.println("O nome do animal é: " + nome);
        System.out.println("Sendo da espécie: " + especie);
        System.out.println("Com a idade: " + idade);

    }

    public void aniversario() {
        idade++;
    }

    public boolean ehAdulto() {
        return idade >= 5;
    }
}