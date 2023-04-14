package Playground;

import java.util.Scanner;

public class MeanMedianMode {
        /*
     * A class with methods to find the mean median and mode in a list of integers.
     */

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
           int median = length / 2;
           System.out.println("Median: " + median);
           return median;
        }

        else{
            return -1;
        }
    }
    
    // Finds the Mean of an array of numbers
    public static int findMean(int[] arr){
        int mean = 0;

        return mean;
    }

    // Finds the Mode of an Array of numbers
    public static int findMode(int[] arr){
        //TODO
        return -1;
    }
    public static void main(String[] args) {
     int[] arr = fillArrayFromInput();
     findMedian(arr);
     
    }
}

