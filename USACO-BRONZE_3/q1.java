import java.io.*;
import java.util.*;

class q1 {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("q1.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q1.out"));

        int n = Integer.parseInt(f.readLine());

        int[] ar = new int[n];
        int[] ar2 = new int[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            ar[i] = Integer.parseInt(st.nextToken());
            ar2[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i + 1] - ar[i] > max) {
                max = ar[i + 1] - ar[i];
            }
            if (ar2[i + 1] - ar2[i] > max2) {
                max2 = ar2[i + 1] - ar2[i];
            }
        }
        int answer = (max * max2) / 2;
        System.out.println(max);
        System.out.println(max2);
        System.out.println(answer);
        out.println(answer);
        out.close();
    }
}