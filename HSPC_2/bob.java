import java.util.*;
import java.io.*;

class bob {
    static int h = 0;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("bob.in"));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int coinnum = 0;
        int[][] ar = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
                if (ar[i][j] == 2) {
                    coinnum++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        ar[x][y] = 4;
        path(x, y, 0, 0, ar, coinnum, count);
        display(ar);
        if (h == 0) {
            System.out.println("-1");
        }
    }

    public static void path(int x, int y, int a, int b, int ar[][], int coinnum, int count) {
        if (a < 0 || a >= ar.length) {
            return;
        }
        if (b < 0 || b >= ar[a].length) {
            return;
        }
        if (ar[a][b] == 1) {
            return;
        }
        if (ar[a][b] == 3) {
            return;
        }
        if (ar[a][b] == 2) {
            ar[a][b] = 0;
            coinnum--;
        }
        if (coinnum == 0 && ar[a][b] == 4) {
            h = count;
            System.out.println(count);
            return;
        }
        count++;
        ar[a][b] = 3;
        path(x, y, a, b + 1, ar, coinnum, count);
        path(x, y, a, b - 1, ar, coinnum, count);
        path(x, y, a + 1, b, ar, coinnum, count);
        path(x, y, a - 1, b, ar, coinnum, count);
    }

    public static void display(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
        System.out.println();
    }
}