package application;

import entities.Rectangle;
//import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

/*        Triangle x, y;
          x = new Triangle();
          y = new Triangle();

          System.out.println("Enter the measures of triangle X: ");
          x.a = scan.nextDouble();
          x.b = scan.nextDouble();
          x.c = scan.nextDouble();

          System.out.println("Enter the measures of triangle Y: ");
          y.a = scan.nextDouble();
          y.b = scan.nextDouble();
          y.c = scan.nextDouble();

          double areaX = x.area();
          double areaY = y.area();

          System.out.printf("Triangle X area: %.4f%n", areaX);
          System.out.printf("Triangle Y area: %.4f%n", areaY);

          if (areaX > areaY){
              System.out.println("Larger area: X");
          } else {
              System.out.println("Larger area: Y");
          }
*/
        Rectangle x = new Rectangle();
        System.out.println("Enter the measures of a Rectangle: ");

        x.width = scan.nextDouble();
        x.height = scan.nextDouble();

        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PERIMETER = %.2f%n", perimeter);
        System.out.printf("DIAGONAL = %.2f%n", diagonal);
        scan.close();
    }
}
