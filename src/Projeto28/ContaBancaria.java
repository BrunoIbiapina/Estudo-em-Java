package Projeto28;

public class ContaBancaria {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(int numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;

    }

    public ContaBancaria(int numeroConta, String nomeCliente, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        deposito(depositoInicial);
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saqueRealizado(double quantia) {
        saldo -= quantia + 5.0;

    }
    public String toString(){
        return 
            "Numero Conta: "
            +numeroConta   
            +"Nome cliente: "
            +nomeCliente
            +"Saldo: R$ "
            +String.format("%.2f", saldo);

    }

   
    

    

}
