package projeto24;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.ativa = true;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (getAtiva()) {
            if (valor > 0) {
                setSaldo(getSaldo() + valor);

            } else {
                System.out.println("O valor digitado não pode ser depositado.");
            }
        } else {
            System.out.println("Não é possível fazer o depósito pq a conta não está ativa.");
        }
    }

    public void sacar(double valor) {
        if (getAtiva()) {
            if (getSaldo() >= saldo) {
                setSaldo(getSaldo() - valor);

            } else {
                System.out.println("Saldo indisponível para saque.");
            }

        } else {
            System.out.println("Não é possível sacar dinheira em conta desativada");
        }

    }

}
