import java.io.*;
import java.util.*;

class hopping {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("hopping.in"));
        PrintWriter out = new PrintWriter(new FileWriter("hopping.out"));

        int n = Integer.parseInt(f.readLine());
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = Integer.parseInt(f.readLine());
        }
        int s = ar[0];
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < n; i++) {
            if (i == s) {
                if ((i + ar[i]) >= n) {
                    out.println("true");
                    out.close();
                } else {
                    s += ar[i];
                }
            }
        }
        out.println("false");
        out.close();
    }
}