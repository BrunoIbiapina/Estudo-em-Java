package projeto13;

public class ContaBancaria {
    String titular;
    double saldo;
    String numeroConta;

    public ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void exibirConta() {
        System.out.println("O titular da conta é: " + titular);
        System.out.println("Seu saldo é: " + saldo);
        System.out.println("O número da conta é: " + numeroConta);
    }

    public void depositar(double valor) {

        saldo += saldo;

    }

public void sacar(double valor){
    if(saldoSuficiente(valor)){
    saldo -= valor;
    }
    else{
        System.out.println("Saldo insuficiente para saque" + valor);    }
}

    public boolean saldoSuficiente(double valor) {
        return saldo >= valor;
    }
}
