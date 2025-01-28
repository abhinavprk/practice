package abhi.practice.random;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1771));
        System.out.println(isPalindrome(-1771));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome( 1_534_236_469));
        System.out.println(isPalindrome(1_534_236_469));
    }

    private static boolean isPalindrome(int number) {
        int candidate = Math.abs(number); // In case one wants to check even for negative numbers, otherwise make the original number a candidate
        int reverse = 0;
        int curr = candidate;
        while(curr > 0){
            int remainder = curr % 10;
            if (reverse > (Integer.MAX_VALUE - remainder) / 10) {
                return false; // Overflow occurred, not a palindrome
            }
            reverse = reverse * 10 + remainder;
            curr = curr/10; // Since both operands are int, the result is not rounded off but truncated to an int
        }
        System.out.println("candidate is: " + candidate);
        System.out.println("reverse is: " + reverse);
        return reverse == candidate;

    }
}
