package abhi.application;

public class ReverseAString {

    public static void main(String[] args) {

        System.out.println(reverseStringTwoPointer("MyNameIsAbhinav"));
        System.out.println(reverseStringTwoPointer("MyNameIsYourName"));
    }

    private static String reverseStringWithIteration(String stringToReverse) {
        StringBuilder reversed = new StringBuilder();
        char[] chars = stringToReverse.toCharArray();
        for(int i = chars.length-1; i >= 0 ; i-- ) {
            reversed.append(chars[i]);
        }
        return reversed.toString();
    }

    private static String reverseStringTwoPointer(String stringToReverse) {
        char[] chars = stringToReverse.toCharArray();
        int x = 0;
        int y = chars.length-1;
        while(y>x ) {
            char temp = chars[y];
            chars[y] = chars[x];
            chars[x] = temp;
            y--;
            x++;
        }
        return new String(chars);
    }
}
