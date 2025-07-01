package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");

        float celsius = scanner.nextFloat();
        float fahrenheit = celsius * (9.0f / 5.0f) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
        scanner.close();
    }
}