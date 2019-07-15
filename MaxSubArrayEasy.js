var maxSubArray = function(nums) {
    let res = [];
    nums.forEach((num) => {
        let resSize = res.length;
        if (res.length > 0) {
        if(res[resSize-1] < 0) {
            res.push(num);
        } else {
            res.push(res[resSize-1] + num);
        }
        } else {
            res.push(num);
        }
    });
    return Math.max(...res);
};
