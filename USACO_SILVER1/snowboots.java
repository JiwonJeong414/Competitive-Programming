import java.util.*;
import java.io.*;

class snowboots {
    static boolean[][] dp;
    static int[] depth;
    static int[][] boots;

    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("snowboots.in"));
        PrintWriter out = new PrintWriter(new FileWriter("snowboots.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        dp = new boolean[B][N];
        st = new StringTokenizer(f.readLine());
        depth = new int[N];
        boots = new int[B][2];
        for (int i = 0; i < depth.length; i++) {
            depth[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < boots.length; i++) {
            st = new StringTokenizer(f.readLine());
            boots[i][0] = Integer.parseInt(st.nextToken());
            boots[i][1] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(depth));
        System.out.println(Arrays.toString(boots));
    }
}
