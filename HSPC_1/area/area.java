import java.io.*;
import java.util.*;

class area {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("area.in"));
        int max = 0;
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        int[] y = new int[p];
        for (int i = 0; i < p; i++) {
            y[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        if (k == n) {
            for (int i = 0; i < n; i++) {
                if (i != n - 1 && Math.abs(x[i] - x[i + 1]) > max) {
                    max = Math.abs(x[i] - x[i + 1]);
                }
            }
            for (int i = 0; i < p; i++) {
                if (i != p - 1 && Math.abs(y[i] - y[i + 1]) > max) {
                    max = Math.abs(y[i] - y[i + 1]);
                }
            }
        } else {
            int[] s = new int[k];
            int[] a = new int[k];
            for (int i = n; i > n - k; i--) {
                for (int j = i - 1; j > 0; j--) {
                    if(j != i){
                        s[0] = x[i - 1];
                        a[0] = y[i - 1];
                        s[1] = x[j - 1];
                        a[1] = y[j - 1];
                        System.out.println(Arrays.toString(s));
                        System.out.println(Arrays.toString(a));
                        if(check(s, a) > max){
                            max = check(s, a);
                        }
                    }
                }
            }
        }
        System.out.println((max + 2) * (max + 2));
    }
    public static int check(int[] q, int[] z){
        int max1 = 0;
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(z));
            for (int i = 0; i <q.length; i++) {
                if (i != q.length - 1 && Math.abs(q[i] - q[i + 1]) > max1) {
                    max1 = Math.abs(q[i] - q[i + 1]);
                }
            }
            for (int i = 0; i < z.length; i++) {
                if (i != z.length - 1 && Math.abs(z[i] - z[i + 1]) > max1) {
                    max1 = Math.abs(z[i] - z[i + 1]);
                }
            }
        return max1;
    }
}