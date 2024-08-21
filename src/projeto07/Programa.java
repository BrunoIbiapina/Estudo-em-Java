package projeto07;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Bruno", "Teresina", 30);
        pessoa.exibirInformacoes();
        pessoa.aniversario();
        System.out.println("Após o aniversário: ");
        pessoa.exibirInformacoes();
    }
}
