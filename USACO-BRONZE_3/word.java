import java.util.*;
import java.io.*;

class word {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("word.in"));
        PrintWriter out = new PrintWriter(new FileWriter("word.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int[] ar = new int[N];
        st = new StringTokenizer(f.readLine());
        for (int i = 0; i < N; i++) {
            String word = st.nextToken();
            ar[i] = word.length();
            cnt += word.length();
            if (word.length() < K && cnt <= K && i > 0) {
                out.print(" ");
            }
            if (cnt > K) {
                out.println("");
                cnt = 0;
                cnt += word.length();
            }
            if (cnt == K) {
                out.print(word);
            }
            if (word.length() < K && cnt < K) {
                out.print(word);
            }
        }
        out.close();
    }
}