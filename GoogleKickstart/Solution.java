import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = 0;
        int m = 0;
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            s = 0;
            m = 0;
            int n = sc.nextInt();
            int b = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            Arrays.sort(ar);
            for (int i = 0; i < n; i++) {
                s = s + ar[i];
                if (s <= b) {
                    m++;
                } else {
                    break;
                }
            }
            System.out.println("Case #" + (j + 1) + ": " + m);
        }
    }
}