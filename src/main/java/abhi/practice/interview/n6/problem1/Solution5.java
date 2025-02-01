package abhi.practice.interview.n6.problem1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution5 {

    public static void main(String[] args) {
        solution(12345);
        solution(10011);
        solution(1);
        solution(100);

    }

    private static void solution(int num) {

        String str = String.valueOf(num);
        char[] charArr = str.toCharArray();
        //Get a list of revered characters
        List<Character> charList = IntStream
                .range(0, charArr.length)
                .mapToObj( i -> charArr[i])
                .toList()
                .reversed();
        //Find the index of first non-zero Index
        int firstNonZeroIndex = -1;
        for(Character ch : charList){
            if(ch != '0'){
                //Break as soon as you find the first non-zero index
                firstNonZeroIndex++;
                break;
            } else {
                firstNonZeroIndex ++;
            }
        }
        //Print starting from the first non-zero index
        for (int i = firstNonZeroIndex; i< charList.size(); i++){
            System.out.print(charList.get(i));
        }
        System.out.println();
    }
}


