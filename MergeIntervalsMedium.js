function mergeIntervals(intervals) {
    const len =intervals.length;
    if(len === 0) return [];
    if(len === 1) return intervals;
    // Sort intervals by start time
    intervals.sort((a,b) => a[0]-b[0]);
    let res = [];
    let prev = intervals[0];
    
    for(let i = 1; i < len; i++) {
        if(prev[1] >= intervals[i][0]) {
            prev = [
                Math.min(prev[0],intervals[i][0]),
                Math.max(prev[1],intervals[i][1])
            ];
        } else {
            res.push(prev);
            prev = intervals[i];
        }
    }
    res.push(prev);
    return res;
}

let arr = [[1,3],[2,6],[8,10],[15,18]];
mergeIntervals(arr);
/*
(3) [Array(2), Array(2), Array(2)]
0: (2) [1, 6]
1: (2) [8, 10]
2: (2) [15, 18]
*/
