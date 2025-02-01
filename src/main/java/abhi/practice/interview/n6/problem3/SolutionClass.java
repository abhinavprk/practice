package abhi.practice.interview.n6.problem3;

public class SolutionClass {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{20,50,100,200}));
    }


    public static  int solution(int[] A) {
        // Implement your solution here
        int minRotation = Integer.MAX_VALUE;
        //Check every possible rotation assuming that every angle could be a target angle
        for(int tarAngle : A){
            int totalRoation = 0;
            for (int currAngle : A){
                int rotation = Math.abs(currAngle - tarAngle);
                rotation = Math.min(rotation, 360 - rotation);
                totalRoation = totalRoation + rotation;
            }
            minRotation = Math.min(minRotation, totalRoation);
        }
        return minRotation;
    }
}
