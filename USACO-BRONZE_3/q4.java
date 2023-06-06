import java.io.*;
import java.util.*;

class q4 {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("q4.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q4.out"));

        int n = Integer.parseInt(f.readLine());

        int[] ar = new int[n];

        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(ar));
        st = new StringTokenizer(f.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int set = (end - start + 1) / 2;
        int cnt = 0;
        for (int i = 0; i < set; i++) {
            cnt = ar[start - 1];
            ar[start - 1] = ar[end - 1];
            ar[end - 1] = cnt;
            start = start + 1;
            end = end - 1;
        }
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < n; i++) {
            out.print(ar[i] + " ");
        }
        out.close();
    }
}