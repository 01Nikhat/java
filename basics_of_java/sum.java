package basics_of_java;

import java.util.Scanner;

public class sum {
    public  static void main(StringDemo [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter First Number : ");
        int firstNum = input.nextInt();
        System.out.print("Please Enter Second Number : ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum ;
        System.out.println("Your Sum is : " + sum);
    }

}
