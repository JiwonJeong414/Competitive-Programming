import java.io.*;
import java.util.*;

public class s1 {
    public static void main(String[] args) throws Exception {
        // change long
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] ar2 = new int[N + 1];
        TreeSet<Integer>[] ar3 = new TreeSet[N + 1];
        for (int i = 1; i < ar2.length; i++) {
            ar2[i] = i;
        }
        // System.out.println(Arrays.toString(ar2));
        int[][] ar = new int[K][2];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(f.readLine());
            ar[i][0] = Integer.parseInt(st.nextToken());
            ar[i][1] = Integer.parseInt(st.nextToken());
            // System.out.println(Arrays.toString(ar[i]));
        }
        for (int i = 1; i < N + 1; i++) {
            ar3[i] = new TreeSet<Integer>();
            ar3[ar2[i]].add(i);
        }
        for (int k = 0; k < 100; k++) {
            for (int j = 0; j < K; j++) {
                int cnt = ar2[ar[j][0]];
                ar2[ar[j][0]] = ar2[ar[j][1]];
                ar2[ar[j][1]] = cnt;
                for (int i = 1; i < N + 1; i++) {
                    ar3[ar2[i]].add(i);
                }
            }
        }
        // System.out.println(Arrays.toString(ar3));
        for (int i = 1; i < N + 1; i++) {
            System.out.println(ar3[i].size());
        }
    }
}