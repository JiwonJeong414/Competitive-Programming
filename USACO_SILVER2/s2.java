import java.io.*;
import java.util.*;

public class s2 {
    public static void main(String[] args) throws IOException {
        // ABBAABCB
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        String fence = f.readLine();
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken());
            System.out.println(check(fence.substring(0, a)) + check(fence.substring(b, fence.length())));
        }
    }

    public static int check(String c) {
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < c.length(); i++) {
            set.add(c.substring(i, i + 1));
        }
        // System.out.println(set);
        return set.size();
    }
}