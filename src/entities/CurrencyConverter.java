package entities;

public class CurrencyConverter {
    public static double dollarPrice;

    public static double conversion(double bought){
        return dollarPrice * bought * 1.06;
    }
}
