package abhi.practice.interview.n6.problem3;

import java.util.Arrays;

public class Solution7 {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{20, 50, 100, 200}));
        System.out.println(solution(new int[]{350, 0, 0}));
        System.out.println(solution(new int[]{270, 301, 301, 302, 50, 70, 100}));
    }

    public static int solution(int[] A) {
        int aLength = A.length;

        // Step 1: Sort the angles
        Arrays.sort(A);

        // Step 2: Extend the array to handle wrap-around
        int[] extendedAngles = new int[2 * aLength];
        for (int i = 0; i < aLength; i++) {
            extendedAngles[i] = A[i];
            extendedAngles[i + aLength] = A[i] + 360;
        }

        // Step 3: Compute prefix sums
        long[] prefixSum = new long[2 * aLength + 1];
        for (int i = 0; i < 2 * aLength; i++) {
            prefixSum[i + 1] = prefixSum[i] + extendedAngles[i];
        }

        // Step 4: Find minimal total rotation using sliding window and prefix sums
        return getMinTotalRotation(aLength, prefixSum, extendedAngles);
    }

    private static int getMinTotalRotation(int aLength, long[] prefixSum, int[] extendedAngles) {
        int minTotalRotation = Integer.MAX_VALUE;
        for (int i = 0; i < aLength; i++) {
            int mid = i + aLength / 2;  // Median index in the window

            // Sum of rotations for the left half of the window
            long leftSum = prefixSum[mid] - prefixSum[i];
            long leftCount = mid - i;

            // Sum of rotations for the right half of the window
            long rightSum = prefixSum[i + aLength] - prefixSum[mid];
            long rightCount = (i + aLength) - mid;

            int medianAngle = extendedAngles[mid];

            // Total rotation is sum of distances from the median
            long totalRotation = (medianAngle * leftCount - leftSum) + (rightSum - medianAngle * rightCount);
            minTotalRotation = (int) Math.min(minTotalRotation, totalRotation);
        }
        return minTotalRotation;
    }

}
