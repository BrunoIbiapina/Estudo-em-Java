package projeto03;

public class Salario {

    public String name;
    public double glossSalaray;
    public double tax;

    public double netSalary() {
        return glossSalaray - tax;
    }

    public void IncreaseSalary(double Percentage) {
        glossSalaray += glossSalaray * Percentage / 100.0;
    }

    public String toString() {
        return name + ", $" + String.format("%.2f%n", netSalary());
    }
}
