import java.io.*;
import java.util.*;

class tridiagonal {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("tridiagonal.in"));
        PrintWriter out = new PrintWriter(new FileWriter("tridiagonal.out"));

        int r = Integer.parseInt(f.readLine());
        int c = Integer.parseInt(f.readLine());
        int[][] ar = new int[r][c];
        int cnt = 0;
        int cnt2 = 1;
        boolean answer = true;
        for (int i = 0; i < r; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int j = 0; j < c; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
            System.out.println(Arrays.toString(ar[i]));
        }
        for (int i = 0; i < r - 1; i++) {
            if (ar[cnt][cnt2] == 0) {
                answer = false;
            }
            cnt++;
            cnt2++;
        }
        cnt = 0;
        cnt2 = 1;
        for (int i = 0; i < c - 1; i++) {
            if (ar[cnt2][cnt] == 0) {
                answer = false;
            }
            cnt++;
            cnt2++;
        }
        System.out.println(answer);
        out.println(answer);
        out.close();
    }
}