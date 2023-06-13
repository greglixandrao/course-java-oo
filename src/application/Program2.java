package application;

import entities.Salario;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Salario salario = new Salario();

        System.out.print("Name: ");
        salario.name = scan.nextLine();
        System.out.print("Gross Salary: ");
        salario.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        salario.tax = scan.nextDouble();

        System.out.println();
        System.out.printf("Employee: %s, $ %.2f%n", salario.name, salario.netSalary());
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        salario.increaseSalary(scan.nextDouble());
        System.out.println();
        System.out.printf("Update data: %s, $ %.2f%n", salario.name, salario.netSalary());

        scan.close();
    }
}
