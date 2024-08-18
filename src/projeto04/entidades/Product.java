package projeto04.entidades;

public class Product {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double faltandoParaPassar() {
        return nota1 + nota2 + nota3;
    }

    public double primeiroSimestre() {
        if (faltandoParaPassar() < 60.0) {
            return 60.0 - faltandoParaPassar();
        } else {
            return 0.0;
        }
    }

}
