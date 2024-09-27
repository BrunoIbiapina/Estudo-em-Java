package projeto24;

public class Program {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Ana Clara", "12345");

        System.out.println("INFOMACOES CONTA : ");
        System.out.println("TITULAR: " + conta1.getTitular());
        System.out.println("NÚMERO CONTA" + conta1.getNumeroConta());
        System.out.println("Saldo: " + conta1.getSaldo());
        System.out.println("Status da conta: " + conta1.getAtiva());

    }
    
}
