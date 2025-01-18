package Loop;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to completing challenge ");
        Scanner input = new Scanner(System.in);


        String pass;
        do {
            System.out.print("please enter your password :");
            pass = input.next();
        }
        while (!isValidPassword(pass));
        System.out.println("Thank you for entering Your Password");


    }
    public static boolean isValidPassword(String pass){
        return pass.length() >6;
    }
}
