import java.util.Scanner;

public class MaxS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        // Fix: Handle the edge case where the user enters 0 or a negative number
        if (n <= 0) {
            System.out.println("Invalid input. Array must have at least one element.");
            sc.close();
            return; // Exit the program gracefully
        }

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Fix: Separate the logic into its own method
        int maxSum = findMaxSubarraySum(arr);
        
        System.out.println("Maximum subarray sum is: " + maxSum);
        sc.close();
    }

    /**
     * Finds the maximum sum of a contiguous subarray using Kadane's Algorithm.
     */
    public static int findMaxSubarraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // Either start a new subarray at arr[i], or add arr[i] to the existing one
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            // Update the global maximum if the current subarray sum is greater
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}