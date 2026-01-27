package algo.implementation;

import java.util.ArrayList;

public class PGS_133502_makeHamburger {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }

    static int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : ingredient) {
            list.add(i);

            if (list.size() >= 4) {
                int size = list.size();

                if (list.get(list.size() - 4) == 1 &&
                        list.get(list.size() - 3) == 2 &&
                        list.get(list.size() - 2) == 3 &&
                        list.get(list.size() - 1) == 1
                ) {
                    list.remove(size - 1);
                    list.remove(size - 2);
                    list.remove(size - 3);
                    list.remove(size - 4);

                    answer++;
                }
            }
        }

        return answer;
    }
}
