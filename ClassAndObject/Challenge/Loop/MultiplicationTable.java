package Loop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to the Multiplication Table");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int number = input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(number + "*" + i + "=" + number*i );
        }

    }
}
