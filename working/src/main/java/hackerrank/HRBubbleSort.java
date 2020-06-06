package main.java.hackerrank;

import java.util.*;

/**
 * Consider the following version of Bubble Sort:
 *
 * for (int i = 0; i < n; i++) {
 *
 *     for (int j = 0; j < n - 1; j++) {
 *         // Swap adjacent elements if they are in decreasing order
 *         if (a[j] > a[j + 1]) {
 *             swap(a[j], a[j + 1]);
 *         }
 *     }
 *
 * }
 * Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:
 *
 * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * First Element: firstElement, where  is the first element in the sorted array.
 * Last Element: lastElement, where  is the last element in the sorted array.
 * Hint: To complete this challenge, you must add a variable that keeps a running tally of all swaps that occur during execution.
 *
 * For example, given a worst-case but small array to sort:  we go through the following steps:
 *
 * swap    a
 * 0       [6,4,1]
 * 1       [4,6,1]
 * 2       [4,1,6]
 * 3       [1,4,6]
 * It took  swaps to sort the array. Output would be
 *
 * Array is sorted in 3 swaps.
 * First Element: 1
 * Last Element: 6
 * Function Description
 *
 * Complete the function countSwaps in the editor below. It should print the three lines required, then return.
 *
 * countSwaps has the following parameter(s):
 *
 * a: an array of integers .
 * Input Format
 *
 * The first line contains an integer, , the size of the array .
 * The second line contains  space-separated integers .
 *
 * Constraints
 *
 * Output Format
 *
 * You must print the following three lines of output:
 *
 * Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
 * First Element: firstElement, where  is the first element in the sorted array.
 * Last Element: lastElement, where  is the last element in the sorted array.
 * Sample Input 0
 *
 * 3
 * 1 2 3
 * Sample Output 0
 *
 * Array is sorted in 0 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 0
 * The array is already sorted, so  swaps take place and we print the necessary three lines of output shown above.
 *
 * Sample Input 1
 *
 * 3
 * 3 2 1
 * Sample Output 1
 *
 * Array is sorted in 3 swaps.
 * First Element: 1
 * Last Element: 3
 * Explanation 1
 * The array is not sorted, and its initial values are: . The following  swaps take place:
 *
 * At this point the array is sorted and we print the necessary three lines of output shown above.
 */

public class HRBubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] array) {
        int n = array.length;
        int totalSwaps = 0;

        for (int i = 0; i < n; i++) {
            // number of swaps for current array iteration
            int numSwaps = 0;
            for(int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    numSwaps++;
                    totalSwaps++;
                }
            }
            if (numSwaps == 0) {
                System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
                System.out.printf("First Element: %d\n", array[0]);
                System.out.printf("Last Element: %d\n", array[n - 1]);

                break;
            }
        }

    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i]=array[j];
        array[j] = tmp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}

