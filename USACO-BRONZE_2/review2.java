import java.util.*;
import java.io.*;

class review2 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("review2.in"));
        PrintWriter out = new PrintWriter(new FileWriter("review2.out"));

        int N = Integer.parseInt(f.readLine());
        int[] ar = new int[N];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
            System.out.println(Arrays.toString(ar));
        }
        st = new StringTokenizer(f.readLine());
        for (int i = 0; i < ar.length; i++) {
            ar[i] += Integer.parseInt(st.nextToken());
            System.out.println(Arrays.toString(ar));
        }
        out.println(Arrays.toString(ar));
        out.close();
    }
}