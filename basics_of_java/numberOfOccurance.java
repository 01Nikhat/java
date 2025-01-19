package basics_of_java;

import java.util.Scanner;

public class numberOfOccurance {
    public static  void main(String[] args){
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Finding Number of Occurance");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number you want to find :");
        int num = input.nextInt();
        int occurance = numOfOccurance(numArray,num);
        System.out.println("Your number is find in array at occurance :" + occurance);


    }
    public static int numOfOccurance(int[] numArray , int num){
        int occ = 0;
        int i = 0;
        while(i < numArray.length){
            if(numArray[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
