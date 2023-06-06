import java.io.*;
import java.util.*;

class breedflip {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("breedflip.in"));
        PrintWriter out = new PrintWriter(new FileWriter("breedflip.out"));

        int N = Integer.parseInt(f.readLine());

        char[] ar = new char[N];
        char[] ar2 = new char[N];

        ar = f.readLine().toCharArray();
        ar2 = f.readLine().toCharArray();

        System.out.println(Arrays.toString(ar));
        System.out.println(Arrays.toString(ar2));

        int cnt = 0;
        int cnt2 = 0;
        for (int i = 0; i < N; i++) {
            cnt = 0;
            for (int j = 0; j < N; j++) {
                System.out.println(cnt2);
                if (ar[i + cnt] != ar2[i + cnt]) {
                    cnt++;
                    if (i != N - 1 && ar[i + cnt] != ar2[i + cnt]) {
                        System.out.println("true");
                    } else {
                        cnt2++;
                        break;
                    }
                    break;
                }
                break;
            }
        }
        System.out.println(cnt2);
        out.println(cnt2);
        out.close();
    }
}