package algo.dfs_bfs;

import java.util.ArrayList;

public class Example {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        dfs(1, 3);
    }

    static void dfs(int idx, int n) {
        if (idx > n) {
            System.out.println(list);
            return;
        }

        // 선택
        list.add(idx);
        dfs(idx + 1, n);

        // 되돌리기
        list.remove(list.size() - 1);

        // 선택 안함
        dfs(idx + 1, n);
    }
}
