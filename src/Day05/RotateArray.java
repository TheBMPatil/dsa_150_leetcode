package Day05;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));

//C:\Users\bhagv\.jdks\temurin-21.0.5\bin\java.exe "-classpath "D:\Bhagvat Data\IntellijProjects\DSA_Day_wise\out\production\DSA_Day_wise" Day05.RotateArray
//[1, 2, 3, 4, 5, 6, 7]
//[5, 6, 7, 1, 2, 3, 4]
//        Process finished with exit code 0

    }


    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k is greater than n
        reverse(nums, 0, n - 1);  // Reverse the entire array
        reverse(nums, 0, k - 1);  // Reverse the first k elements
        reverse(nums, k, n - 1);  // Reverse the rest of the array
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


}
