package abhi.practice.interview.n6.problem3;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{20, 50, 100, 200}));
        System.out.println(solution(new int[]{350, 0, 0}));
        System.out.println(solution(new int[]{270, 301, 301, 302, 50, 70, 100}));
    }

    //Doesn't work for 3rd test case
    public static int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;

        // Choose the median angle as the target
        int medianAngle = A[n / 2];
        int minTotalRotation = calculateTotalRotation(A, medianAngle);

        // Check one neighbor around the median to ensure minimal rotation (for circular wrap-around)
        int neighborAngle = (medianAngle + 180) % 360;
        int neighborRotation = calculateTotalRotation(A, neighborAngle);

        return Math.min(minTotalRotation, neighborRotation);
    }

    private static int calculateTotalRotation(int[] A, int targetAngle) {
        int totalRotation = 0;
        for (int angle : A) {
            int rotation = Math.abs(angle - targetAngle);
            totalRotation += Math.min(rotation, 360 - rotation);
        }
        return totalRotation;
    }

}
