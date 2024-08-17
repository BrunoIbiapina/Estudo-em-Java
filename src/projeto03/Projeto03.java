package projeto03;

import java.util.Locale;
import java.util.Scanner;

public class Projeto03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario emp = new Salario();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross Salary: : ");
        emp.glossSalaray = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double Percentage = sc.nextDouble();
        emp.IncreaseSalary(Percentage);

        System.out.println();
        System.out.println("Uptudate data: " + emp);
        sc.close();

    }

}
