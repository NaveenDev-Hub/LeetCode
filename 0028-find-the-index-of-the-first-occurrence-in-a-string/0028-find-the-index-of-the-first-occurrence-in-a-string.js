/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
   let firstIndexx = 0;
   let len = needle.length;

   if(needle.length > haystack.length ) {
    return -1;
   }

    for(let i = 0; i <= haystack.length - len; i++) {
        if (needle === haystack.substring(i, i + len)){
            return i;
        }
    }
    return -1;
    
};