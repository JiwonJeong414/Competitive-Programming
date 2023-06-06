import java.util.*;
import java.io.*;

class gymnastics {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter out = new PrintWriter(new FileWriter("gymnastics.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        int[] ar = new int[N];
        int count = 0;
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(f.readLine());
            for (int j = 0; j < N; j++) {
                int number = Integer.parseInt(st.nextToken());
                ar[j] = number;
            }
            for (int j = 0; j < N; j++) {
                for (int b = j + 1; b < N; b++) {
                    String pair = ar[j] + "," + ar[b];
                    map.put(pair, map.getOrDefault(pair, 0) + 1);
                    if (map.get(pair) == K) {
                        count++;
                    }
                }
            }
            System.out.println(map);
            System.out.println(Arrays.toString(ar));
        }
        System.out.println(count);
        out.println(count);
        out.close();
    }
}