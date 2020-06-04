package main.java;

import java.util.Arrays;

public class CyclicRotation {

    /**
     *
     * Input : [1,2,3,4,5,6,7] and n=7, k=3
     * Output : [5,6,7,1,2,3,4]
     * After reversing all numbers : [7,6,5,4,3,2,1]
     * After reversing first k numbers : [5,6,7,4,3,2,1]
     * After reversing last n-k numbers : [5,6,7,1,2,3,4]
     */
    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] inputArray = {1,2,3,4,5,6,7};
        int[] outputArray = new int[10];
        int numberOfTimes = 3;
        outputArray = cyclicRotation.rotate(inputArray, numberOfTimes);
        System.out.println("Rotated output array = " + Arrays.toString(outputArray));
    }

   public int[] rotate(int[] inputArray, int numberOfTimes) {
        int[] outputArray = new int[10];
        numberOfTimes = numberOfTimes % inputArray.length;
        outputArray = reverse(inputArray, 0, inputArray.length-1);
        outputArray = reverse(inputArray, 0, numberOfTimes-1);
        outputArray = reverse(inputArray, numberOfTimes, inputArray.length-1);
        return outputArray;
   }

   public int[] reverse(int[] inputArray, int start, int end) {
        while(start < end) {
            int temp = inputArray[start];
            inputArray[start] = inputArray[end];
            inputArray[end] = temp;
            start++;
            end--;
        }
        return inputArray;
   }

}
