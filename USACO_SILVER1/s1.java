import java.util.*;
import java.io.*;

public class s1 {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(f.readLine());
        int E = V - 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < E; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a > b) {
                int c = a;
                a = b;
                b = a;
            }
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        int total = 0;
        for (int key : map.keySet()) {
            int cnt = map.get(key) + 1;
            int cnt2 = 0;
            int cnt4 = 1;
            while (cnt > cnt4) {
                cnt2++;
                cnt4 = cnt4 * 2;
            }
            total += cnt2 + (cnt - 1);
        }
        System.out.println(total);

    }
}
