package abhi.practice.interview.n6.problem3;

import java.util.Arrays;

public class Solution4 {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{20, 50, 100, 200}));
        System.out.println(solution(new int[]{350, 0, 0}));
        System.out.println(solution(new int[]{270, 301, 301, 302, 50, 70, 100}));
    }

    //Doesn't work for 3rd test case
    public static int solution(int[] A) {
        double sumX = 0, sumY = 0;

        // Convert angles to unit circle coordinates
        for (int angle : A) {
            double radians = Math.toRadians(angle);
            sumX += Math.cos(radians);
            sumY += Math.sin(radians);
        }

        // Calculate the mean angle
        double meanAngleRadians = Math.atan2(sumY, sumX);
        int meanAngleDegrees = (int) Math.toDegrees(meanAngleRadians);
        if (meanAngleDegrees < 0) {
            meanAngleDegrees += 360;
        }

        // Calculate total rotation to align all angles to the mean angle
        int totalRotation = 0;
        for (int angle : A) {
            int rotation = Math.abs(angle - meanAngleDegrees);
            totalRotation += Math.min(rotation, 360 - rotation);
        }

        return totalRotation;
    }

}
