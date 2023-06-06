import java.io.*;
import java.util.*;

class crossroad {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("crossroad.in"));
        PrintWriter out = new PrintWriter(new FileWriter("crossroad.out"));
        int N = Integer.parseInt(f.readLine());
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int ID = Integer.parseInt(st.nextToken());
            int side = Integer.parseInt(st.nextToken());
            if (map.containsKey(ID) && map.get(ID) != side) {
                count++;
            }
            map.put(ID, side);
        }
        System.out.println(map);
        System.out.println(count);
        out.println(count);
        out.close();
    }
}