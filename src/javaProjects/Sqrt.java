package javaProjects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    try {
    double number = Double.parseDouble(scanner.nextLine());
        if (number < 0) {
            throw new IllegalArgumentException("Number less than zero.");
        } else {
            System.out.println("Square root : " + Math.sqrt(number));
        }
    } catch (NumberFormatException e) {
        System.out.println("The given number is not a number - mistake: " + e.getMessage());
    } finally {
        System.out.println("Finish");
    }




    }

}
