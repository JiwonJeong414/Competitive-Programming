import java.io.*;
import java.util.*;

class paint {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("paint.in"));
        PrintWriter out = new PrintWriter(new FileWriter("paint.out"));
        int h = Integer.parseInt(f.readLine());
        String w = f.readLine();
        int p = w.length();
        boolean n = true;
        int cnt = 0;
        char[][] ar = new char[h][w.length()];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = w.toCharArray();
            System.out.println(Arrays.toString(ar[i]));
            w = f.readLine();
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < p; j++) {
                if (j != p - 1 && ar[i][j] == ar[i][j + 1]) {
                    n = true;
                } else if (i != h - 1 && ar[i][j] == ar[i + 1][j]) {
                    n = true;
                } else {
                    n = false;
                }
                System.out.println(n);
                if (n == false) {
                    cnt++;
                }
                n = true;
            }
        }
        System.out.println(cnt);
    }
}
