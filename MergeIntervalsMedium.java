import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

*/
public class MergeIntervals {

public static int[][] merge(int[][] intervals) {
	        if(intervals.length<2)
	            return intervals;
	        Arrays.sort(intervals, new Comparator<int[]>() {
	            @Override
	            public int compare(int[] i1, int[] i2) {
	                return i1[0] - i2[0];
	            }
	        });
	        int j = 0;
	        for (int i=1; i<intervals.length; i++) {
	            if(intervals[i][0] <= intervals[j][1]) 
	                intervals[j][1] = Math.max(intervals[j][1], intervals[i][1]);
	            else {
	                j++;  
	                intervals[j][0] = intervals[i][0];
	                intervals[j][1] = intervals[i][1];     
	            }
	        }
	        int[][] ans = new int[j+1][2];
	        for(int i=0;i<=j;i++) {
	            for(int k=0;k<2;k++) {
	                ans[i][k] = intervals[i][k];
	            }
	        }
	        return ans;
	    }

static void printIntervals(int[][] result) {
	for (int[] a : result) {
		System.out.print("[");
	    for (int s : a) {
	        System.out.print(s +",");
	    }
	    System.out.print("]");
	}
}

public static void main(String args[]) {
	int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
	int[][] result = merge(intervals);	
	printIntervals(result);
}


}
