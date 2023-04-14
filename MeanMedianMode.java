package Playground;

import java.util.Scanner;

public class MeanMedianMode {
        /*
     * A class with methods to find the mean median and mode in a list of integers.
     */

     // Null Check
     public static void nullCheck(int[] arr){
        if (arr == null) {
            throw new IllegalArgumentException("Input array must not be null or empty");
        }
     }

    // Fills an array with numbers based on user input.
     public static int[] fillArrayFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        scanner.close();
        return arr;
    }

    // Finds the middle number in an Array
    public static int findMedian(int[] ints){
        nullCheck(ints);
        int length = ints.length;
        // Even Case
        if (length % 2 == 0){
            int midIndex = length / 2;
            int median = (ints[midIndex - 1] + ints[midIndex]) / 2;
            System.out.println("Median: " + median);
            return median;
        }
        // Odd Case
        if (length % 2 == 1){
            nullCheck(ints);
           int median = length / 2 + 1; // Bug here?
           System.out.println("Median: " + median);
           return median;
        }
        else{
            return -1;
        }
    }
    
    // Finds the Mean of an array of numbers
    public static int findMean(int[] ints){
        nullCheck(ints);
        int mean = 0;
        int sum = 0;

        for (int i = 0; i < ints.length; i++){
            sum += ints[i];
        }
        mean = sum / ints.length;
        System.out.println("Mean: " + mean);
        return mean;
    }

    // Finds the Mode of an Array of numbers
    public static int findMode(int[] arr){
        int mode = 0;
        for (int i = 0; i <= arr.length; i++){
            mode = arr[i];
            if (mode == arr[i+1]){
                mode = arr[i];
            }
            else {
                mode = arr[i+1];
            }
        }
        return mode;
    }
    public static void main(String[] args) {
     int[] arr = fillArrayFromInput();
     findMedian(arr);
     findMean(arr);
     findMode(arr);
    }
}

