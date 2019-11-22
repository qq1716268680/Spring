package leecode1262;

public class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = {0,0,0};
        for(int i=0;i<nums.length;i++){
            int mod = nums[i] % 3;
            int a = dp[(3 + 0 - mod) % 3];
            int b = dp[(3 + 1 - mod) % 3];
            int c = dp[(3 + 2 - mod) % 3];

            if (a!=0 || mod == 0) dp[0] = Math.max(dp[0], a + nums[i]);
            if (b!=0 || mod == 1) dp[1] =  Math.max(dp[1], b + nums[i]);
            if (c!=0 || mod == 2) dp[2] =  Math.max(dp[2], c + nums[i]);

        }

        return dp[0];
    }

    public static void main(String[] args) {
        int[] nums = {9,8,7,6,5,4,3,2,1};
        System.out.printf(""+ new Solution().maxSumDivThree(nums));
    }
}
