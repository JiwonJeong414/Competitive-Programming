import java.io.*;
import java.util.*;

class q2 {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("q2.in"));
        PrintWriter out = new PrintWriter(new FileWriter("q2.out"));

        int n = Integer.parseInt(f.readLine());

        char[] ar = new char[n];
        char[] ar2 = new char[n];

        HashSet<String> set = new HashSet<>();

        ar = f.readLine().toCharArray();
        ar2 = f.readLine().toCharArray();

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ar[i] != ar2[i]) {
                count++;
            }
            set.add("" + ar[i] + "" + ar2[i]);
        }
        System.out.println(set);
        System.out.println(count);
        out.println(count);
        out.close();
    }
}