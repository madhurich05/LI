/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

class MaxSubArrayEasy {
    public int maxSubArray(int[] nums) {
        int arrLen = nums.length;
        int res[] = new int[arrLen];
        res[0] = nums[0];
        int max = res[0];
        
        for (int i=1; i< arrLen;i++) {
            res[i] = nums[i] + ((res[i-1] >0) ? res[i-1]:0);
            max = Math.max(max,res[i]);
        }
        return max;
    }
}
