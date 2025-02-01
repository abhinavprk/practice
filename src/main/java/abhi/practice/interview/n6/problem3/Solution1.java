package abhi.practice.interview.n6.problem3;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{20, 50, 100, 200}));
        System.out.println(solution(new int[]{350, 0, 0}));
        System.out.println(solution(new int[]{270, 301, 301, 302, 50, 70, 100}));
    }


    public static int solution(int[] A) {
        // Implement your solution here
        int minRotation = Integer.MAX_VALUE;
        //Check every possible rotation assuming that every angle could be a target angle
        for (int tarAngle : A) {
            int totalRoation = 0;
            for (int currAngle : A) {
                int rotation = Math.abs(currAngle - tarAngle);
                rotation = Math.min(rotation, 360 - rotation);
                totalRoation = totalRoation + rotation;
                if(totalRoation>minRotation){
                    break;
                }
            }
            minRotation = Math.min(minRotation, totalRoation);
        }
        return minRotation;
    }
}
