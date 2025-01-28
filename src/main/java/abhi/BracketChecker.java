package abhi;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketChecker {

    public static void main(String[] args) {


        System.out.println(bracketChecker(""));
        System.out.println(bracketChecker("(((())))"));
        System.out.println(bracketChecker(")("));
        System.out.println(bracketChecker("(()"));

    }

    private static boolean bracketChecker(String s) {
        Stack<Character> charStack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char curr : charArray) {
            if (curr == '(') {
                charStack.push(curr);
            } else {
                if (!charStack.empty()) {
                    char top = charStack.peek();
                    if (top == ')') {
                        charStack.push(curr);
                    } else {
                        charStack.pop();
                    }
                }
            }
        }
        return charStack.empty();
    }
}
