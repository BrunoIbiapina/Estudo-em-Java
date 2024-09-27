package Projeto26;

public class Program {
    public static void main(String[] args) {
        TipodeCarro carro1 = new TipodeCarro();
        TipodeCarro carro2 = new TipodeCarro();

        carro1.tipoDecarro = "Fiat";
        carro1.formaAbastecer = "Gasolina";
        carro1.Apresentacao();

        carro2.tipoDecarro = "Fusca";
        carro2.formaAbastecer = "Elétrico";
        carro2.Apresentacao();

        

    }
}
