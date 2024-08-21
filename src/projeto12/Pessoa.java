package projeto12;

/*Crie uma classe chamada Pessoa com os atributos nome, idade, e altura. Crie um método exibirPessoa() que 
imprime as informações da pessoa. Em seguida, crie um método fazerAniversario() que aumenta a idade da pessoa 
em um ano e um método ehMaiorDeIdade() que retorna true se a idade da pessoa for maior ou igual a 18 anos. */

public class Pessoa {

    String nome;
    int idade;
    double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void exibirPessoa() {
        System.out.println("Nome é: " + nome);
        System.out.println("Idade é: " + idade);
        System.out.println("Altura é: " + altura);

    }

    public void fazerAniversario() {
        idade = idade + 1;
    }

    public void ehMaiorDeIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }

}
