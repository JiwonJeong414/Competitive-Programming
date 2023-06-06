import java.util.Arrays;

class bat {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 1, 4, 4, 3, 1 };
        int a = 0;
        int s = 0;
        int b = 0;
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (cnt == 0 && nums[0] == 3 && nums[1] != 4) {
                a = 0;
                cnt++;
            }
            if (cnt == 0 && nums[i] == 3 && nums[i + 1] != 4) {
                a = i;
                cnt++;
            }
            if (cnt == 0 && nums[0] == 4 && nums[i - 1] != 3) {
                b = 0;
                cnt++;
            }
            if (cnt == 0 && nums[i] == 4 && nums[i - 1] != 3) {
                b = i;
                cnt++;
            }
            if (cnt == 1 && nums[i] == 4 && nums[i - 1] != 3) {
                s = nums[a + 1];
                nums[a + 1] = nums[i];
                nums[i] = s;
                i = 1;
                cnt = 0;
            }
            if (cnt == 1 && nums[i] == 3 && nums[i + 1] != 4) {
                s = nums[b + 1];
                nums[b + 1] = nums[i];
                nums[i] = s;
                i = 1;
                cnt = 0;
            }
            if (i == nums.length - 1 && cnt == 1) {
                i = 1;
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(s);
            System.out.println(cnt);
            System.out.println(Arrays.toString(nums));
        }
    }
}