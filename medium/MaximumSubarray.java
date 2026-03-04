package medium;

//Given an integer array nums, find the subarray with the largest sum, and return its sum.
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int curr = nums[0];

        for ( int i = 1; i < nums.length; i++ ){
            curr = Math.max(curr + nums[i], nums[i]);
            best = Math.max(best, curr);
        }

        return best;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println( new MaximumSubarray().maxSubArray(nums));
    }
}
