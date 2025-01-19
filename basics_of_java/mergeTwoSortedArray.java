package basics_of_java;

public class mergeTwoSortedArray {
    public static void main(StringDemo[] args){
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[ ] mergeArray = mergingSortedArray(arr1,arr2);
        System.out.print("Merged array are :");
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }
    }
    public static int[] mergingSortedArray(int[]arr1,int[]arr2){
        int size = arr2.length + arr1.length;
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i < arr1.length || j < arr2.length){
            if((i < arr1.length && arr1[i] < arr2[j]) || j==arr2.length){
                mergedArray[k] = arr1[i];
                i++;
                k++;
            }
            else {
                mergedArray[k] = arr2[j];
                j++;
                k++;
            }

        }
        return mergedArray;


    }
}
