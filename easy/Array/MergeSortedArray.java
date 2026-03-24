package easy.Array;

//You are given two integer arrays nums1 and nums2,
//sorted in non-decreasing order, and two integers m and n,
//representing the number of elements in nums1 and nums2 respectively.

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r = m + n - 1;
        int r1 = m - 1;
        int r2 = n - 1;

        while ( r2 >= 0 ){
            if ( r1 >= 0 && nums1[r1] > nums2[r2] ){
                nums1[r] = nums1[r1];
                r1--;
            } else {
                nums1[r] = nums2[r2];
                r2--;
            }
            r--;
        }
    }

    public static void main(String[] args) {
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        new MergeSortedArray().merge(nums1, 1, nums2, 1);
        for ( int num : nums1 ){
            System.out.print(num + " ");
        }
    }
}
