import java.io.*;
import java.util.*;

class triangles {

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("triangles.in"));
        PrintWriter out = new PrintWriter(new FileWriter("triangles.out"));

        int N = Integer.parseInt(f.readLine());

        int[] ar = new int[N];
        int[] ar2 = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            ar[i] = Integer.parseInt(st.nextToken());
            ar2[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N; j++) {
                for (int s = 2; s < N; s++) {
                    if (ar[i] == ar[j] && ar2[i] == ar2[s]) {
                        if ((Math.abs(ar2[i] - ar2[j]) * Math.abs(ar[i] - ar[s])) > max) {
                            System.out.println("base: " + Math.abs(ar2[i] - ar2[j]));
                            System.out.println("height: " + Math.abs(ar[i] - ar[s]));
                            max = Math.abs(ar2[i] - ar2[j]) * Math.abs(ar[i] - ar[s]);
                        }
                    }

                    if (ar[i] == ar[j] && ar2[j] == ar2[s]) {
                        if ((Math.abs(ar2[i] - ar2[j]) * Math.abs(ar[j] - ar[s])) > max) {
                            System.out.println("base: " + Math.abs(ar2[i] - ar2[j]));
                            System.out.println("height: " + Math.abs(ar[j] - ar[s]));
                            max = Math.abs(ar2[i] - ar2[j]) * Math.abs(ar[j] - ar[s]);
                        }
                    }

                    if (ar[j] == ar[s] && ar2[i] == ar2[s]) {
                        if ((Math.abs(ar2[j] - ar2[s]) * Math.abs(ar[i] - ar[s])) > max) {
                            System.out.println("base: " + Math.abs(ar2[j] - ar2[s]));
                            System.out.println("height: " + Math.abs(ar[i] - ar[s]));
                            max = Math.abs(ar2[j] - ar2[s]) * Math.abs(ar[i] - ar[s]);
                        }
                    }

                    if (ar[j] == ar[s] && ar2[s] == ar2[j]) {
                        if ((Math.abs(ar2[j] - ar2[s]) * Math.abs(ar[s] - ar[j])) > max) {
                            System.out.println("base: " + Math.abs(ar2[j] - ar2[s]));
                            System.out.println("height: " + Math.abs(ar[s] - ar[j]));
                            max = Math.abs(ar2[j] - ar2[s]) * Math.abs(ar[s] - ar[j]);
                        }
                    }
                }
            }
        }
        System.out.println(max);
        out.println(max);
        out.close();
    }
}