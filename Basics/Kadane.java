import java.util.Scanner;

public class Kadane {
    public static int maxSubarraySum(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array must be non-empty");
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comma-separated integers (e.g. -2,1,-3,4):");
        String line = sc.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("No input provided");
            sc.close();
            return;
        }

        String[] parts = line.split(",");
        int[] arr = new int[parts.length];
        int idx = 0;
        for (String p : parts) {
            p = p.trim();
            if (p.isEmpty()) continue;
            try {
                arr[idx++] = Integer.parseInt(p);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + p);
                sc.close();
                return;
            }
        }

        if (idx == 0) {
            System.out.println("No valid numbers provided");
            sc.close();
            return;
        }

        if (idx < arr.length) {
            int[] tmp = new int[idx];
            System.arraycopy(arr, 0, tmp, 0, idx);
            arr = tmp;
        }

        int result = maxSubarraySum(arr);
        System.out.println("Maximum subarray sum is: " + result);
        sc.close();
    }
}
