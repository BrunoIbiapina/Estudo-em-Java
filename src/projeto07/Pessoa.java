package projeto07;

public class Pessoa {
    // atributos
    String nome;
    String cidade;
    int idade;

    // construtor
    public Pessoa(String name, String cidade, int idade) {
        this.nome = name;
        this.cidade = cidade;
        this.idade = idade;
    }
    public Pessoa(){
        
    }

    // metodos
    public void exibirInformacoes() {
        System.out.println("Nome:" + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Idade: " + idade);

    }
    

    // metodo aumentar idade
    public void aniversario() {
        idade++;
    }
}
