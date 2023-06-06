import java.util.*;
import java.io.*;

public class s2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(f.readLine());
        int[][] ar = new int[N][2];
        System.out.println(N);
        for (int r = 0; r < N; r++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int c = 0; c < 2; c++) {
                ar[r][c] = Integer.parseInt(st.nextToken());
            }
            System.out.println(Arrays.toString(ar[r]));
        }
    }
}
