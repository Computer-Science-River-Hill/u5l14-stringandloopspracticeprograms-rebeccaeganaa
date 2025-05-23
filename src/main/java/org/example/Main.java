package org.example; //DO NOT DELETE

//IMPORT STATEMENTS
import java.util.Scanner;
//CLASS 
//main METHOD
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Further substring fun");
        System.out.println("2 - Run of Integers");
        System.out.println("3 - Sum of a Range of sequential integers");
        System.out.println("4 - Repeatedly echo a word");
        System.out.println("5 - Words separated by dots");
        System.out.println("6 - Adding up integers");
        System.out.println("7 - Shipping cost calculator");
        System.out.print("Welcome, please enter which exercise you want to do: ");
        int x = scanner.nextInt();

        if (x == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String originalString = scanner1.nextLine();
            System.out.print("Enter beginning index: ");
            int beginIndex = scanner1.nextInt();
            System.out.print("Enter ending index: ");
            int endIndex = scanner1.nextInt();
            if (beginIndex < 0 || endIndex > originalString.length() || beginIndex >= endIndex) {
                System.out.println("Invalid indices. Please make sure 0 <= beginIndex < endIndex <= string length");
            } else {
                String newString = originalString.substring(beginIndex, endIndex);
                System.out.println("\nOriginal string: ");
                System.out.println(originalString);
                System.out.println("\nSubstring:");
                System.out.println(newString);
            }
        }
        if (x == 2) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter start: ");
            int start = scanner2.nextInt();
            System.out.println("Enter end: ");
            int end = scanner2.nextInt();
            if (start <= end) {
                System.out.println("");
                for (int i = start; i <= end; i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Start value must be less than or equal to End value. ");
            }
        }
        if (x ==3) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter low: ");
            int low = scanner3.nextInt();
            System.out.println("Enter high: ");
            int high = scanner3.nextInt();
            if (low > high) {
                System.out.println("Low must be less than high");
            } else {
                int sumToHigh = (high * (high + 1)) / 2;
                int sumToLowMinusOne = ((low - 1) * low) / 2;
                int totalSum = sumToHigh - sumToLowMinusOne;
                System.out.println("Sum = " + totalSum);
            }
        }
        if (x == 4) {
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Enter a word: ");
            String inputString = scanner4.nextLine();
            int times = inputString.length();
            System.out.println("");
            for (int i = 0; i < times; i++) {
                System.out.println(inputString);
            }
        }
        if (x == 5) {
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Enter first word: ");
            String firstWord = scanner5.nextLine();
            System.out.println("Enter second word: ");
            String secondWord = scanner5.nextLine();
            int totalLength = 30;
            int dotsCount = totalLength - (firstWord.length() + secondWord.length());
            System.out.print(firstWord);
            for (int i = 0; i < dotsCount; i++) { 
                System.out.print(".");
            }
            System.out.println(secondWord);
        }
        if (x == 6) {
            Scanner scanner6 = new Scanner(System.in);
            System.out.println("How many integers will be added: ");
            int count = scanner6.nextInt();
            int sum = 0;
            for (int i = 0; i < count; i++) {
                System.out.println("Enter an integer: ");
                int number = scanner.nextInt();
                sum += number;
            }
            System.out.println("\nThe sum is " + sum);
        }
        if (x == 7) {
            Scanner scanner7 = new Scanner(System.in);
            while (true) {
                System.out.println("Weight of Order: ");
                double weight = scanner7.nextDouble();
                if (weight<= 0 ) {
                    System.out.println("\nbye");
                    break;
                }
                double shippingCost = 3.00;
                if (weight > 10) {
                    shippingCost += (weight - 10) * 0.25;
                }
                System.out.printf("Shipping cost: $%.2f%n%n", shippingCost);
            }
        }
        scanner.close();
    }
}