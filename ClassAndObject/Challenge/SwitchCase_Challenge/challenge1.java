package SwitchCase_Challenge;

import com.sun.source.util.SourcePositions;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class challenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to find minimum two number");
        System.out.print("Enter your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        int smallernum = num1 < num2 ? num1:num2;
        System.out.println("Minimum Number is: " + smallernum);
    }
}
