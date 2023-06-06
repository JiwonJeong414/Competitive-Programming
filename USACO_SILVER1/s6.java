import java.util.*;
import java.io.*;

class s6 {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 6, 8 };
        int target = 10;
        System.out.println(numsSubseq(nums, target));
    }

    static Deque<Integer> dq = new LinkedList<>();

    public static int numsSubseq(int[] nums, int target) {
        search(nums, 0, target);
        return cnt;
    }

    static int cnt = 0;

    public static int search(int[] ar, int i, int target) {
        if (i == ar.length) {
            if (!dq.isEmpty()) {
                if (getMinMax() <= target) {
                    cnt++;
                }
            }
        } else {
            dq.add(ar[i]);
            search(ar, i + 1, target);
            dq.removeLast();
            search(ar, i + 1, target);
        }
        return cnt;
    }

    public static int getMinMax() {
        Deque<Integer> dq2 = new LinkedList<>();
        int size2 = dq.size();
        for (int i = 0; i < size2; i++) {
            dq2.add(dq.peekFirst());
            dq.addLast(dq.peekFirst());
            dq.removeFirst();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int size = dq2.size();
        for (int j = 0; j < size; j++) {
            if (dq2.peekFirst() < min) {
                min = dq2.peekFirst();
            }
            if (dq2.peekFirst() > max) {
                max = dq2.peekFirst();
            }
            dq2.removeFirst();
        }
        return min + max;
    }
}
