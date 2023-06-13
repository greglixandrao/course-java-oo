package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Whats is de dollar price? ");
        CurrencyConverter.dollarPrice = scan.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double totalInReais = CurrencyConverter.conversion(scan.nextDouble());
        System.out.printf("Amount to be paid in reais = %.2f%n", totalInReais);
        scan.close();
    }
}
