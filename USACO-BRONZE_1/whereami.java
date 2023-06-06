import java.util.*;
import java.io.*;

class whereami {
    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("whereami.in"));
        PrintWriter out = new PrintWriter(new FileWriter("whereami.out"));

        int N = Integer.parseInt(f.readLine());
        String mailboxes = f.readLine();
        HashSet<String> set = new HashSet<>();
        f1: for (int size = 0; size < N; size++) {
            for (int i = 0; i < N + 1 - size; i++) {
                String p = mailboxes.substring(i, i + size);
                if (set.contains(p))
                    continue f1;
                set.add(p);
            }
            System.out.println(size);
            out.println(size);
            out.close();
            break;
        }
    }
}