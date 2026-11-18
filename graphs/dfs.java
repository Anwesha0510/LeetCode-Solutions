
import java.util.*;

class Main {
    static ArrayList<Integer>[] adj;
    static boolean[] visited;

    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbour : adj[node]) {
            if (!visited[neighbour]) {
                dfs(neighbour);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;

        adj = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        adj[1].add(2);
        adj[1].add(3);
        adj[2].add(4);
        adj[2].add(5);

        dfs(1);
    }
}
