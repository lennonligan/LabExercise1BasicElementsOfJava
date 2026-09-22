package LabExercise1BasicElementsOfJava;

import java.util.Scanner;

public class MultiplyTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int temp = number;

        // Extract individual digits
        int hundreds = temp / 100;
        temp %= 100;

        int tens = temp / 10;
        int ones = temp % 10;

        // Display individual digits as shown in sample output
        if (hundreds > 0) {
            System.out.println(hundreds);
        }
        if (hundreds > 0 || tens > 0) {
            System.out.println(tens);
        }
        System.out.println(ones);

        // Compute digit product
        int product = 1;
        if (hundreds > 0) product *= hundreds;
        if (hundreds > 0 || tens > 0) product *= tens;
        product *= ones;

        System.out.println("The product of all digits in " + number + " is " + product);

        input.close();
    }
}