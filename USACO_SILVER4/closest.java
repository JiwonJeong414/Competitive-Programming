import java.util.*;
import java.io.*;

class closest {
    static int group[];

    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new File("closest.in"));

        Stack<Integer> stack = new Stack<>();

        int K = in.nextInt();
        int M = in.nextInt();
        int N = in.nextInt();

        int patch[] = new int[K];
        int taste[] = new int[K];
        group = new int[K];

        for (int i = 0; i < K; i++) {
            patch[i] = in.nextInt();
            taste[i] = in.nextInt();
        }
        for (int j = 0; j < M; j++) {
            stack.push(in.nextInt());
        }
        System.out.println(Arrays.toString(patch));
        System.out.println(Arrays.toString(taste));

        System.out.println(stack);
        for (int i = 0; i < patch.length; i++) {
            if()
        }
    }
}
