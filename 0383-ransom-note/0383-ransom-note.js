/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    
    if (magazine.length < ransomNote.length) {
        return false;
    }
    for(const c of new Set(ransomNote)) {
        if(magazine.split(c).length-1 < ransomNote.split(c).length - 1) {
            return false;
        }
    }
    return true;
    
};