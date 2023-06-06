import java.util.*;
import java.io.*;

class race {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("race.in"));
        PrintWriter out = new PrintWriter(new FileWriter("race.out"));

        StringTokenizer st = new StringTokenizer(f.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        System.out.println(k + " " + n);

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(f.readLine());
            System.out.println(x);
            int speed = 1;
            int distance = 0;
            int count = 0;

            while (distance < k) {
                if (speed < x) {
                    distance += speed;
                    count++;
                } else {
                    if (distance + speed >= k) {
                        distance += speed;
                        count++;
                    } else {
                        distance += 2 * speed;
                        count += 2;
                    }
                }
                speed++;
            }
            System.out.println(count);
            out.println(count);
        }

        out.close();
    }
}