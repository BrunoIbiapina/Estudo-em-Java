package projeto13;

public class Program {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Bruno Ibiapina Silva", 200, "30-401");
        conta1.exibirConta();
        conta1.depositar(500);
        conta1.sacar(300);
        conta1.exibirConta();

    }
}
