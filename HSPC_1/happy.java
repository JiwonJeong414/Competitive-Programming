import java.io.*;
import java.util.*;

class happy {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("happy.in"));
        PrintWriter out = new PrintWriter(new FileWriter("happy.out"));

        String S = f.readLine();
        String E = f.readLine();
        char[] ar = S.toCharArray();
        char[] ar2 = E.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        System.out.println(ar);
        System.out.println(ar2);
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
            map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
        }
        for (int i = 0; i < ar2.length; i++) {
            System.out.println(ar2[i]);
            map2.put(ar2[i], map2.getOrDefault(ar2[i], 0) + 1);
        }
        System.out.println(map);
        System.out.println(map2);
        int answer = 0;
        for (char key : map.keySet()) {
            if (map.get(key) != map2.get(key)) {
                answer += map.get(key);
            }
        }
        System.out.println(answer);
        out.println(answer);
        out.close();
    }
}