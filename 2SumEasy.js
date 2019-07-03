var twoSum = function(nums, target) {
    let res = [];
    let map = new Map();
    for(let i=0;i<nums.length;i++) {
       if (map.has(target - nums[i])) {
            res.push(i, map.get(target - nums[i]));
       } 
            map.set(nums[i],i);
    }
    return res;
   
};
