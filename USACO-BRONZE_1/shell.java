import java.io.*;
import java.util.*;

class shell {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("shell.in"));
        PrintWriter out = new PrintWriter(new FileWriter("shell.out"));
        int N = Integer.parseInt(f.readLine());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        boolean[] test1 = { true, false, false };
        boolean[] test2 = { false, true, false };
        boolean[] test3 = { false, false, true };

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            int g = Integer.parseInt(st.nextToken()) - 1;

            boolean temp = test1[a];
            test1[a] = test1[b];
            test1[b] = temp;
            if (test1[g] == true) {
                count1++;
            }
            temp = test2[a];
            test2[a] = test2[b];
            test2[b] = temp;
            if (test2[g] == true) {
                count2++;
            }
            temp = test3[a];
            test3[a] = test3[b];
            test3[b] = temp;
            if (test3[g] == true) {
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        int max = 0;
        if (count1 > max) {
            max = count1;
        }
        if (count2 > max) {
            max = count2;
        }
        if (count3 > max) {
            max = count3;
        }
        out.println(max);
        out.close();
    }
}