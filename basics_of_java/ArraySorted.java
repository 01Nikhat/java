package basics_of_java;

public class ArraySorted {
    public static void main(String[] args) {
        // Input array from the user
        int[] numArray = ArrayUtility.inputArray();

        // Sort the array
        int[] sortedArray = isIncreasing(numArray);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] isIncreasing(int[] numArray) {
        int n = numArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numArray[j] > numArray[j + 1]) {
                    // Swap elements
                    int temp = numArray[j];
                    numArray[j] = numArray[j + 1];
                    numArray[j + 1] = temp;
                }
            }
        }
        return numArray;
    }
}
