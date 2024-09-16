package java_prepa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ParenthesesChecker {
    public static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        Set<Character> opening = new HashSet<>(Arrays.asList('(', '[', '{'));
        Set<Character> closing = new HashSet<>(Arrays.asList(')', ']', '}'));

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');

        for (char c : parentheses.toCharArray()) {
            if (opening.contains(c)) {
                stack.push(c);
            } else if (closing.contains(c)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(c)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "(3 + 5 * (4 - 1] - 39)";
        System.out.println("L'expression est équilibrée : " + isBalanced(expression));
    }
}
