import java.io.*;
import java.util.*;

class cowroute {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("cowroute.in"));
        PrintWriter out = new PrintWriter(new FileWriter("cowroute.out"));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int price = 1001;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int Ncities = Integer.parseInt(st.nextToken());
            int count = 0;
            st = new StringTokenizer(f.readLine());
            for (int j = 0; j < Ncities; j++) {
                int city = Integer.parseInt(st.nextToken());
                if (city == A && count == 0) {
                    count++;
                }
                if (city == B && count == 1 && price > cost) {
                    price = cost;
                }
            }
        }
        if (price == 1001) {
            out.println("-1");
            out.close();
        } else {
            out.println(price);
            out.close();
        }
    }
}