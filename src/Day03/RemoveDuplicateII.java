package Day03;

import java.util.Arrays;

public class RemoveDuplicateII {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int n = removeDuplicates(nums, 3);
        System.out.print(n + " " + Arrays.toString(nums));

    }

    public static int removeDuplicates(int[] nums, int val) {
        int k = 0;
        for (int n : nums) {
            if (k<2||n!=nums[k-2]) {
                nums[k++] = n;
            }
        }
        return k;
    }

}
