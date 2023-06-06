import java.io.*;
import java.util.*;

class array {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("array.in"));
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ar));
    }
}
