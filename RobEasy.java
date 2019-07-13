
public class RobEasy {

	public static int rob(int[] nums) {
		int robbedPrev = 0;
		int notRobbedPrev = 0;
		int arrSize = nums.length;
		for(int i=0; i< arrSize;i++) {
			// If curr cell is robbed, then prev cannot be robbed, so add curr val to prev one
			int currRobbed = notRobbedPrev + nums[i];

			// If current cell is not robbed, then the count should be max of the previous cell robbed and not robbed
			int currNotRobbed = Math.max(notRobbedPrev, robbedPrev);
			
			// Update values
			robbedPrev = currRobbed;
			notRobbedPrev = currNotRobbed;
			
		}
		return Math.max(robbedPrev, notRobbedPrev);
	}
	
	public static void main(String args[]) {
		int[] hM = {1,2,3,1};
		System.out.println(rob(hM));
	}

}
