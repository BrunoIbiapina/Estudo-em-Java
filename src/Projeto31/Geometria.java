package Projeto31;

public class Geometria {
    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }

    public double calcularArea(double raio, boolean isCircle) {
        return Math.PI * raio * raio;
    }

}
