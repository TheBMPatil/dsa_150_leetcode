package Day08;

public class JumpGame {
    public static void main(String[] args) {
        int[] prices = {3,2,1,0,4};
//        int[] prices = {2,3,1,1,4};
        System.out.println("Max profit : " + canJump(prices));

    }


    public static boolean canJump(int[] nums) {

        int reachable = 0;
        for (int i = 0; i < nums.length; ++i) {

            if (reachable < i) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }

}
