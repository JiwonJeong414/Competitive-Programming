import java.util.*;

class Solution {
    static int count = 0;

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int num = 44444;
        int count = 0;
        while (true) {
            int first = (int) (Math.random() * num) + 1;
            count++;
            if (!check4(first)) {
                int second = num - first;
                if (!check4(second)) {
                    System.out.println("Answer found!");
                    System.out.println(first + " " + second);
                    System.out.println(count);
                    break;
                }
            }
        }
    }

    public static boolean check4(int num) {
        while (num != 0) {
            if (num % 10 == 4) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}