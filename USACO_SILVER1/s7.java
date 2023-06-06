import java.util.*;
import java.io.*;

public class s7 {
    public static void main(String[] args) throws Exception {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        longestPalindrome(nums);
    }

    public static int longestPalidrome(int[] nums) {
        search(0, nums);
        return 1;
    }

    static Deque<Character> dq = new LinkedList<>();
    static int max = Integer.MIN_VALUE;
    public static int search(int i, int[] nums) {
        if (i == nums.length) {
            if (!dq.isEmpty()) {
                if (sum() > max) {
                    max = sum();
                }
            }
        }
        dq.
        dq.peekFirst();
        dq.add(nums[i]);
        search(i + 1, nums);
        dq.removeLast();
        search(i + 1, nums);
        return max;
    }
    static Deque<Character> dq2 = new LinkedList<>();
    public static int sum(){

    }

}
