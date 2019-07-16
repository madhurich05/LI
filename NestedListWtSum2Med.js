var depthSumInverse = function(nestedList) {
    let depth = 0;
    let weight = 0;
    while (nestedList.length >0) {
        let result = [];
        for (const nl of nestedList) {
            if (nl.isInteger()){
               depth += nl.getInteger();
            } else{
               result= result.concat(nl.getList());
            }      
        }
        weight += depth;
        nestedList = result;
    }
    return weight;  
};
