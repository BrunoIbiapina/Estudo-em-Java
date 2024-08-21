package projeto11;

import java.time.Year;

public class Carro {
    String marca;
    String modelo;
    int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirCarro() {
        System.out.println("A marca do carro é: " + marca);
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O ano do carro é: " + ano);

    }

    public void revisao() {
        ano += 1;
    }

    public boolean ehNovo() {
        int anoAtual = Year.now().getValue();
        return (anoAtual - ano) < 5;

    }
}
