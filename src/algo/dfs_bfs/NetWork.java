package algo.dfs_bfs;

public class NetWork {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }

    static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, computers, visited);
            }
        }

        return answer;
    }

    static void dfs(int computer, int[][] computers, boolean[] visited) {
        visited[computer] = true;

        for (int next = 0; next < computers.length; next++) {
            if (computers[computer][next] == 1 && !visited[next]) {
                dfs(next, computers, visited);
            }
        }
    }
}
