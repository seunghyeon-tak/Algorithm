package algo.implementation;

import java.util.ArrayList;
import java.util.Collections;

public class PGS_120911_stringSort2 {
    public static void main(String[] args) {
        System.out.println(solution("Python"));
    }

    static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            list.add(String.valueOf(Character.toLowerCase(c)));
        }

        Collections.sort(list);

        for (String s : list) {
            answer.append(s);
        }

        return answer.toString();
    }
}
