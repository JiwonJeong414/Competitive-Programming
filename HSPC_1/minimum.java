import java.io.*;
import java.util.*;

class minimum {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("minimum.in"));
        PrintWriter out = new PrintWriter(new FileWriter("minimum.out"));

        int m = Integer.parseInt(f.readLine());
        int[] ar = new int[m];
        for (int i = 0; i < m; i++) {
            ar[i] = Integer.parseInt(f.readLine());
        }
        System.out.println(Arrays.toString(ar));
        int s = Integer.parseInt(f.readLine());
        int[] ar2 = new int[m - s + 1];
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i = 0; i < (m - s + 1); i++) {
            for (int j = 0; j < s; j++) {
                if (ar[j + cnt] < min) {
                    min = ar[j + cnt];
                }
            }
            ar2[i] = min;
            min = Integer.MAX_VALUE;
            cnt++;
        }
        System.out.println(Arrays.toString(ar2));
        out.println(Arrays.toString(ar2));
        out.close();
    }
}