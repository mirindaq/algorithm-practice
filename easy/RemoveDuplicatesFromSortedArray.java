package easy;

//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
//
//Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.
//
//The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
public class RemoveDuplicatesFromSortedArray {
//    public int removeDuplicates(int[] nums) {
//        int index = 1;
//        for ( int i = 1; i < nums.length ; i++ ){
//            if (nums[i] != nums[i - 1]) {
//                nums[index++] = nums[i];
//            }
//        }
//        return index;
//    }

    public int removeDuplicates(int[] nums) {
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=nums[l]){
                l++;
                nums[l]=nums[r];
            }
        }
        return l+1;
    }

    public static void main(String[] args) {
//        Input: nums = [0,0,1,1,1,2,2,3,3,4]
//        Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println( new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
        for ( int num : nums ){
            System.out.print(num + " ");
        }

    }
}
