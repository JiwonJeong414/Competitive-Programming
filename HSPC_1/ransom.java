import java.io.*;
import java.util.*;

class ransom {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("ransom.in"));
        PrintWriter out = new PrintWriter(new FileWriter("ransom.out"));

        String ransom = f.readLine();
        String magazine = f.readLine();
        char[] ar = ransom.toCharArray();
        char[] ar2 = magazine.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] - 0 >= 97 && ar[i] - 0 <= 122) {
                System.out.println(ar[i]);
                map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
            }
        }
        System.out.println(map);
        for (int i = 0; i < ar2.length; i++) {
            if (ar2[i] - 0 >= 97 && ar2[i] - 0 <= 122) {
                System.out.println(ar2[i]);
                map2.put(ar2[i], map2.getOrDefault(ar2[i], 0) + 1);
            }
        }
        System.out.println(map2);
        int cnt = 0;
        int cnt2 = 0;
        for (char key : map.keySet()) {
            cnt++;
            if (map2.containsKey(key)) {
                if (map2.get(key) >= map.get(key)) {
                    cnt2++;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(cnt2);
        if (cnt == cnt2) {
            out.println("True");
        } else {
            out.println("False");
        }
        out.close();
    }
}