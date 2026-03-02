package algo.implementation;

import java.util.ArrayDeque;
import java.util.Deque;

public class PGS_12909_correctParentheses {
    public static void main(String[] args) {
        System.out.println(solution("(())()("));
    }

    static boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
