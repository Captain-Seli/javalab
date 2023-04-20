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
    public static int[] createArrayFromUserInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
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
        // Step 1: Find the maximum value in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
            max = arr[i];
            }
        }

        // Step 2: Create a frequency array of size max+1
        int[] freq = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        // Step 3: Find the mode (most frequently occurring element)
        int mode = 0;
        int maxFreq = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mode = i;
            }
        }
        System.out.println("Mode: " + mode);
        return mode;
    }
    public static void main(String[] args) {
     int[] arr = createArrayFromUserInput();
     findMedian(arr);
     findMean(arr);
     findMode(arr);
    }
}

