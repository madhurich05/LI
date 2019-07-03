/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.Map;
import java.util.HashMap;

class 2SumEasy {
public int[] 2Sum(int[] nums, int target) {
   Map<Integer,Integer> map = new HashMap<>();
		        int arrLen = nums.length;
		        for(int i=0; i<arrLen; i++) {
		            Integer j = map.get(target-nums[i]);
		            if(j!=null)
		                return new int[]{i,j};
		            else
		                map.put(nums[i],i);
		        }
		        return new int[]{};
}
