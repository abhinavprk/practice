package abhi.practice.interview.n6.problem3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution6 {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{20, 50, 100, 200}));
        System.out.println(solution(new int[]{350, 0, 0}));
        System.out.println(solution(new int[]{270, 301, 301, 302, 50, 70, 100}));
    }

    public static int solution(int[] A) {
        int aLength = A.length;

        // Step 1: Sort the angles
        Arrays.sort(A);

        // Step 2: Duplicate the array to handle circular wrap-around
        int[] extendedAngles = new int[2 * aLength];
        for (int i = 0; i < aLength; i++) {
            extendedAngles[i] = A[i];
            extendedAngles[i + aLength] = A[i] + 360;
        }

        // Step 3: Sliding window to find the minimal total rotation
        return getMinRotation(aLength, extendedAngles);
    }

    private static int getMinRotation(int aLength, int[] extendedAngles) {
        int minRotation = Integer.MAX_VALUE;
        for (int i = 0; i < aLength; i++) {
            int target = extendedAngles[i + aLength / 2];  // Median in the sliding window
            int totalRotation = 0;
            for (int j = i; j < i + aLength; j++) {
                int rotation = Math.abs(extendedAngles[j] - target);
                totalRotation += Math.min(rotation, 360 - rotation);  // Handle wrap-around
            }
            minRotation = Math.min(minRotation, totalRotation);
        }
        return minRotation;
    }

}
