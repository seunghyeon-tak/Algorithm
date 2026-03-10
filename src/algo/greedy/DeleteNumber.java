package algo.greedy;

import java.util.Stack;

public class DeleteNumber {
    public static void main(String[] args) {
        System.out.println(solution("5276823", 2));
    }

    static String solution(String number, int deleteCount) {
        Stack<Character> stack = new Stack<>();

        for (char n : number.toCharArray()) {
            while (!stack.isEmpty() && deleteCount > 0 && stack.peek() < n) {
                stack.pop();
                deleteCount--;
            }
            stack.push(n);
        }

        while (deleteCount > 0) {
            stack.pop();
            deleteCount--;
        }

        StringBuilder answer = new StringBuilder();
        for (Character character : stack) {
            answer.append(character);
        }

        return answer.toString();
    }
}
