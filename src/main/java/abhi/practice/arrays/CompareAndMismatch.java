package abhi.practice.arrays;

import java.util.Arrays;

public class CompareAndMismatch {

    public static void main(String[] args) {
        int[] ia1 = {0,1,2,6};
        int[] ia2 = {0,1,5};
        int[] ia3 = {0,1,5,6};


        int[] ab = {};
        System.out.println(Math.floor(-0.3));
        System.out.println(Math.floor(0.3));

        System.out.println(Math.ceil(-0.3));
        System.out.println(Math.ceil(0.3));

        System.out.println(Arrays.compare(ia1, ia2));
        System.out.println(Arrays.compare(ia2, ia1));
        System.out.println(Arrays.compare(ia2, ia3));
        System.out.println(Arrays.compare(ia3, ia2));

        System.out.println(Arrays.mismatch(ia1, ia2));
        System.out.println(Arrays.mismatch(ia2, ia1));
        System.out.println(Arrays.mismatch(ia2, ia3));
        System.out.println(Arrays.mismatch(ia3, ia2));

        String[][] names = new String[2][3];
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = "Abhinav"+i+j;
            }
        }

        for (String[] name : names) {
            for (String s : name) {
                System.out.println(s);
            }
        }
        int[][][] nums = new int[1][4][2];
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums[i].length; j++){
                for(int k = 0; k<nums[i][j].length; k++){
                    nums[i][j][k] = i + j + k;
                    System.out.println("num["+i+"]["+j+"]["+k+"] = "+nums[i][j][k]);
                }
            }
        }
        boolean b = false;
        for(int i=0 ; b = !b ; ) {
            System.out.println(i++);
        }
}
}
