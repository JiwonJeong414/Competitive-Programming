import java.util.*;

class Solution {
    static int count = 0;

    public static void main(String[] args) {
        int num = 44444;
        int temp = num;
        int first = 0;
        int mult = 1;
        while (num != 0) {
            count++;
            if (num % 10 == 4) {
                first += (2 * mult);
            }
            mult *= 10;
        }
        System.out.println(first);
        System.out.println(temp - first);
        System.out.println(count);
    }

    public static boolean check4(int num) {
        while (num != 0) {
            count++;
            if (num % 10 == 4) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
}