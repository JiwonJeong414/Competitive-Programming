import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args) {
        int[][] ar = { { 1, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 1 } };
        int cnt2 = 0;
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (ar[i][j] == 1) {
                    cnt2++;
                    check(ar, i, j);
                    display(ar);
                }
            }
        }
        System.out.println(cnt2);
    }

    public static void check(int ar[][], int i, int j) {
        if (i < 0 || i >= ar.length) {
            return;
        }
        if (j < 0 || j >= ar[i].length) {
            return;
        }
        if (ar[i][j] == 3) {
            return;
        }
        if (ar[i][j] == 0) {
            return;
        }
        ar[i][j] = 3;
        check(ar, i, j + 1);
        check(ar, i, j - 1);
        check(ar, i + 1, j);
        check(ar, i - 1, j);
    }

    public static void display(int[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
    }
}