package projeto05;

public class Calculator {
    public final double PI = 3.14159;

    public double circumference(double raio) {
        return 2 * PI * raio;
    }

    public double volume(double raio) {
        return 4.0 * PI * raio * raio * raio / 3.0;
    }
}
