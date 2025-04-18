class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);
        String longestString = "";
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        if (len1 == minLen){
            longestString = word2;
        } 
        if (len2 == minLen) {
            longestString = word1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLen; i ++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(longestString.substring(minLen));
        return sb.toString();
    }
}