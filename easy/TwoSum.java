package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < nums.length; i++ ){
            if ( map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }
            map.put( target - nums[i] , i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(new TwoSum().twoSum(arr, target)));
    }
}