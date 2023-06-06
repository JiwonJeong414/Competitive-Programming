import java.util.*;
import java.io.*;

class photo {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("photo.in"));
        PrintWriter out = new PrintWriter(new FileWriter("photo.out"));

        int N = Integer.parseInt(f.readLine());
        int[] ar = new int[N];
        int[] ar2 = new int[N - 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < N - 1; i++) {
            int b = Integer.parseInt(st.nextToken());
            System.out.println(b);
            ar2[i] = b;
            System.out.println(Arrays.toString(ar2));
        }
        int cnt = 1;
        for (int j = 0; j < N; j++) {
            ar[0] = cnt;
            for (int i = 1; i < N; i++) {
                ar[i] = ar2[i - 1] - ar[i - 1];
                if (ar[i] < 0 || ar[i] > N) {
                    break;
                }
                map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
                map.put(ar[0], 1);
                System.out.println(Arrays.toString(ar));
                System.out.println(map);
                if (map.get(ar[i]) > 1) {
                    break;
                }
            }
            if (map.size() == N) {
                for (int i = 0; i < N; i++) {
                    if (i < N && i != 0) {
                        out.print(" ");
                    }
                    out.print(ar[i]);
                }
                out.close();
            }
            map.clear();
            cnt++;
        }
    }
}