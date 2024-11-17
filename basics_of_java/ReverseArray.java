package basics_of_java;

public class ReverseArray {
    public static void main(String[] args){
        int[] numArray = ArrayUtility.inputArray();
        int[] reverse = reversingArray(numArray);
        System.out.print("Reverse Array elements are :");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");

        }

    }
    public static int[] reversingArray(int[] numArray){
        int n = numArray.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < (n -i -1); j++) {
                int temp = numArray[j];
                numArray[j] = numArray[j+1];
                numArray[j+1] = temp;
            }
        }
        return numArray;
    }
}
