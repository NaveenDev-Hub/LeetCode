/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    
    let preFix = strs[0];
    let preFixLen = preFix.length;

    for (let i = 0 ; i < strs.length ; i ++) {
        let s = strs[i];
        while (preFix !== s.substring(0, preFixLen)) {
            preFixLen--;
        if (preFixLen === 0) {
            return "";
        }
        preFix = preFix.substring(0, preFixLen);

        }
    }
    return preFix;
};