import java.util.*;
import java.io.*;

class barns {
    static ArrayList<Integer> adj[];
    static int V, E;
    static int[] groups;
    static boolean[] visited;
    static LinkedList<Integer> list;
    static int groupnum = 1;

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("barns.in"));
        // queries
        int Q = in.nextInt();
        for (int j = 0; j < Q; j++) {
            V = in.nextInt();
            E = in.nextInt();
            groups = new int[V + 1];
            visited = new boolean[V + 1];
            adj = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++)
                adj[i] = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                adj[a].add(b);
                adj[b].add(a);
            }
            int cnt = 0;
            int minone = Integer.MAX_VALUE;
            int maxone = Integer.MIN_VALUE;
            int minN = Integer.MAX_VALUE;
            int maxN = Integer.MIN_VALUE;
            for (int i = 1; i <= V; i++) {
                if (groups[i] == 0) {
                    groups[i] = groupnum;
                    dfs(i);
                    groupnum++;
                }
            }
            groupnum = groupnum - 1;
            for (int i = 1; i < groups.length; i++) {
                if (groups[i] == 1)
                    if (i > maxone)
                        maxone = i;
                if (groups[i] == 2)
                    if (i < minone)
                        minone = i;
                if (groups[i] == (groupnum - 1))
                    if (i > maxN)
                        maxN = i;
                if (groups[i] == groupnum)
                    if (i < minN)
                        minN = i;
            }
            if ((groupnum) == 3) {
                System.out.println(2);
            } else if ((groupnum) == 2) {
                System.out.println(1);
            } else {
                if ((minone - maxone) + (minN - minone) <= (minN - maxN) + (maxN - maxone)) {
                    System.out.println((minone - maxone) * (minone - maxone) + (minN - minone) * (minN - minone));
                } else {
                    System.out.println((minN - maxN) * (minN - maxN) + (maxN - maxone) * (maxN - maxone));
                }
            }
            groupnum = 1;
        }
    }

    static void dfs(int u) {
        if (visited[u] == true) {
            return;
        }
        visited[u] = true;
        for (int v : adj[u]) {
            groups[v] = groupnum;
            dfs(v);
        }
    }
}
