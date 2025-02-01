package abhi.practice.interview.n6.problem3;

import java.util.HashMap;
import java.util.Map;

public class Solution5 {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{20, 50, 100, 200}));
        System.out.println(solution(new int[]{350, 0, 0}));
        System.out.println(solution(new int[]{270, 301, 301, 302, 50, 70, 100}));
    }

    //Doesn't work for 3rd test case
    public static int solution(int[] A) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequencies of each angle
        for (int angle : A) {
            frequencyMap.put(angle, frequencyMap.getOrDefault(angle, 0) + 1);
        }

        int minTotalRotation = Integer.MAX_VALUE;
        for (int targetAngle : frequencyMap.keySet()) {
            int totalRotation = 0;

            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                int angle = entry.getKey();
                int freq = entry.getValue();
                int rotation = Math.abs(angle - targetAngle);
                rotation = Math.min(rotation, 360 - rotation);
                totalRotation += rotation * freq;
            }

            minTotalRotation = Math.min(minTotalRotation, totalRotation);
        }

        return minTotalRotation;
    }

}
