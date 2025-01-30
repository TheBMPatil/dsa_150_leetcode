package Day09;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] prices = {3,2,1,0,4};
//        int[] prices = {2,3,1,1,4};
        System.out.println("Max profit : " + jump(prices));
    }

        public static int jump(int[] nums) {
            int jumps = 0, current = 0, farthest = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                farthest = Math.max(farthest, nums[i] + i);
                if (i == current) {
                    current = farthest;
                    jumps++;
                }
            }
            return jumps;
        }

}
