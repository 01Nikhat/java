package Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to the prime number is or not validation");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = input.nextInt();
        System.out.println("Your number is " + (isPrime(number) ? "Prime Number" : "Not Prime"));


    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
}