import java.util.*;
import java.io.*;

class s1 {

    public static void main(String[] args) throws Exception {
        // BufferedReader f = new BufferedReader(new FileReader("s1.in"));
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(f.readLine());
        }
        Arrays.sort(ar);
        boolean M = true;
        int total = 0;
        // System.out.println(ar[1] - ar[0]);
        for (int i = 0; i < ar.length; i++) {
            int cnt = 1;
            M = true;
            while (M != false) {
                if (i + cnt <= ar.length - 1 && ((ar[i + cnt] - ar[i]) <= 12) && (ar[i + cnt] / 12) == (ar[i] / 12)) {
                    // System.out.println("hello");
                    cnt++;
                } else {
                    M = false;
                }
            }
            i = i + (cnt - 1);
            total++;
        }
        // System.out.println(Arrays.toString(ar));
        System.out.println(total * 12);
    }
}
