package projeto16;

public class CurrencyConverter {

    double tarifa;

    public CurrencyConverter(double tarifa) {

        this.tarifa = 5.60;

    }

    public double converterParaDolar(double valorReal) {
        return (valorReal / tarifa) * 1.06;

    }

    public void exibirInformacoes(double valorReal) {
        System.out.println("Valor em reais : " + valorReal);
        System.out.printf("Valor convertido em dólares: %.2f", converterParaDolar(valorReal));
        System.out.println();
        System.out.println("Tarifa da cotação: " + tarifa);
    }
    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    }

