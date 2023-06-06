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
        Route[] routes = new Route[N];
        int minCost = 1001;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(f.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int numCities = Integer.parseInt(st.nextToken());
            int[] cities = new int[numCities];
            int aIndex = -1;
            int bIndex = -1;
            st = new StringTokenizer(f.readLine());
            for (int j = 0; j < cities.length; j++) {
                int city = Integer.parseInt(st.nextToken());
                if (city == A)
                    aIndex = j;
                if (city == B)
                    bIndex = j;
                cities[j] = city;
            }
            if (aIndex != -1 && bIndex != -1 && aIndex < bIndex)
                minCost = Math.min(minCost, cost);
            routes[i] = new Route(cities, aIndex, bIndex, cost);
        }

        // compare each VALID route to each other
        // contain A in the first route, contain B in the second route
        // you have to able to get to second route from first route

        System.out.println(minCost);
        System.out.println(Arrays.toString(routes));
    }
}

class Route {
    int[] cities;
    int A;
    int B;
    int cost;

    public Route(int[] cities, int A, int B, int cost) {
        this.cities = cities;
        this.A = A;
        this.B = B;
        this.cost = cost;
    }

    public String toString() {
        return Arrays.toString(cities) + " A: " + A + " B: " + B + " Cost: " + cost;
    }
}