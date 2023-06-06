import java.io.*;
import java.util.*;

class q3 {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("q3.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q3.out"));

        int n = Integer.parseInt(f.readLine());

        int[] ar = new int[n];
        int[] ar2 = new int[n];

        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(ar));
        int cnt = n;
        for (int i = 0; i < ar2.length; i++) {
            cnt = cnt - 1;
            ar2[i] = ar[cnt];
            out.print(ar2[i] + " ");
        }
        System.out.println(Arrays.toString(ar2));
        out.close();
    }
}
