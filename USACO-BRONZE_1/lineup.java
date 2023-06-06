import java.util.*;
import java.io.*;

class lineup {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("lineup.in"));
        PrintWriter out = new PrintWriter(new FileWriter("lineup.out"));

        String[] cows = { "Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue" };
        Arrays.sort(cows);
        int N = Integer.parseInt(f.readLine());

        HashMap<String, List<String>> map = new HashMap<>();

        for (String cow : cows) {
            map.put(cow, new ArrayList<>());
        }

        System.out.println(map);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            String first = st.nextToken();
            st.nextToken();
            st.nextToken();
            st.nextToken();
            st.nextToken();
            String last = st.nextToken();

            map.get(first).add(last);
            map.get(last).add(first);
            System.out.println(map);
        }

        ArrayList<String> order = new ArrayList<>();
        for (String cow : cows) {
            System.out.println("current cow: " + cow);
            if (order.contains(cow) || map.get(cow).size() == 2)
                continue;
            order.add(cow);
            if (map.get(cow).size() == 1) {
                String other = map.get(cow).get(0);
                if (!order.contains(other)) {
                    order.add(other);
                }
                while (map.get(other).size() == 2) {
                    for (String pair : map.get(other)) {
                        if (!order.contains(pair)) {
                            order.add(pair);
                            other = pair;
                        }
                    }
                }
            }
        }
        for (String cow : order) {
            System.out.println(cow);
            out.println(cow);
        }
        out.close();
    }
}