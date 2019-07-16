/**
 * @param {string[]} words
 */
var WordDistance = function(words) {
    this.words = words;
    this.posns = words.reduce((map,word,idx) => {
        map[word] = (map[word] || []).concat(idx);
        return map;
    }, {});
    console.log('Positions ',this.posns);
};

/** 
 * @param {string} word1 
 * @param {string} word2
 * @return {number}
 */
WordDistance.prototype.shortest = function(word1, word2) {
    
    let [pos1,pos2] = [this.posns[word1], this.posns[word2]];
    let [index1, index2] = [0,0];
    
    let minDist = Number.MAX_VALUE;
    while(index1 < pos1.length && index2 < pos2.length) {    
        minDist = Math.min(minDist,Math.abs(pos1[index1] - pos2[index2]));
        if (pos1[index1] < pos2[index2]) {
            index1++;
        } else {
            index2++;
        }
    }
    return minDist;
};

/** 
 * Your WordDistance object will be instantiated and called as such:
 * var obj = new WordDistance(words)
 * var param_1 = obj.shortest(word1,word2)
 */
