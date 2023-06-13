package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();
        student.name = scan.nextLine();
        student.nota1 = scan.nextDouble();
        student.nota2 = scan.nextDouble();
        student.nota3 = scan.nextDouble();

        double finalGrade = student.finalGrade();
        System.out.printf("FINAL GRADE = %.2f%n", finalGrade);
        System.out.println(student.status());

        scan.close();

    }
}
