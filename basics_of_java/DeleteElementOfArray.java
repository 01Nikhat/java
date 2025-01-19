package basics_of_java;

import java.util.Scanner;

public class DeleteElementOfArray {
    public static  void main (String[] args){
        Scanner input = new Scanner(System.in);
        int [] numArray = ArrayUtility.inputArray();

        System.out.print("Insert the number you want to delete :");
        int deleteNum = input.nextInt();
        int[] newArray = deletingElementOfArray(numArray,deleteNum);
        System.out.print("Now our New Array are :");
        for (int i = 0; i < newArray.length-1; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
    public static int FindingPosition(int[] numArray,int deleteElement){
        //first we have to check the position of deleteelement
        int pos = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (deleteElement == numArray[i]){
                 pos = i;
                 break;
            }

        }
        return pos;
    }
    public static int[] deletingElementOfArray(int[] numArray,int deleteElement){
       int pos = FindingPosition(numArray,deleteElement);
        // If element is not found, return the original array
        if (pos == -1) {
            System.out.println("Element not found in the array.");
            return numArray;
        }
        for (int i = pos ; i < numArray.length-1; i++) {
            numArray[i] = numArray[i+1];
        }
        return numArray;

    }
}
