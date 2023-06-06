import java.io.*;
import java.util.*;

class swap {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("swap.in"));
        PrintWriter out = new PrintWriter(new FileWriter("swap.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = i + 1;
        }
        st = new StringTokenizer(f.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int set = (end - start + 1) / 2;
        int cnt2 = 0;
        st = new StringTokenizer(f.readLine());
        int start2 = Integer.parseInt(st.nextToken());
        int end2 = Integer.parseInt(st.nextToken());
        int set2 = (end2 - start2 + 1) / 2;
        int cnt3 = 0;
        for (int s = 0; s < K; s++) {
            for (int i = 0; i < set; i++) {
                cnt2 = ar[start - 1];
                ar[start - 1] = ar[end - 1];
                ar[end - 1] = cnt2;
                start = start + 1;
                end = end - 1;
            }
            for (int i = 0; i < set2; i++) {
                cnt3 = ar[start2 - 1];
                ar[start2 - 1] = ar[end2 - 1];
                ar[end2 - 1] = cnt3;
                start2 = start2 + 1;
                end2 = end2 - 1;
            }
            start = start - set;
            end = end + set;
            start2 = start2 - set2;
            end2 = end2 + set2;
        }
        for (int i = 0; i < N; i++) {
            out.println(ar[i]);
        }
        out.close();
    }
}