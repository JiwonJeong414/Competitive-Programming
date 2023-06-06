import java.util.*;
import java.io.*;

class review {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("review.in"));
        PrintWriter out = new PrintWriter(new FileWriter("review.out"));

        int N = Integer.parseInt(f.readLine());

        int sum = 0;

        StringTokenizer st = new StringTokenizer(f.readLine());
        for (int i = 0; i < N; i++) {
            String word = st.nextToken();
            sum += word.length();
            System.out.println(sum);
            System.out.println(word);
            System.out.println(word.length());
        }
        out.println(sum);
        out.close();
    }
}