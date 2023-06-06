import java.util.*;
import java.io.*;

class unique {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("unique.in"));
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, map.getOrDefault(key, defaultValue))
        List
        int sum = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < n; i++) {
            if (i != 0 && ar[i] == ar[i - 1]) {
                ar[i] = ar[i] + 1;
                Arrays.sort(ar);
                i = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            sum += ar[i];
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(sum);
    }
}