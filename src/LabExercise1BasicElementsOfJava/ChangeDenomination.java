package LabExercise1BasicElementsOfJava;

import java.util.Scanner;

public class ChangeDenomination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount (from 1 - 99 cents): ");
        int amount = input.nextInt();

        int quarters = amount / 25;
        amount %= 25;

        int dimes = amount / 10;
        amount %= 10;

        int nickels = amount / 5;
        amount %= 5;

        int pennies = amount;

        System.out.println("Your change is");
        System.out.println(quarters + " quarter");
        System.out.println(dimes + " dime");
        System.out.println(nickels + " nickel");
        System.out.println(pennies + " penny");

        input.close();
    }
}