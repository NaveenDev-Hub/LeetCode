class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);
        if(i == -1) return word;

        StringBuilder res = new StringBuilder();
        res.append(word.substring(0, i+1)).reverse();
        res.append(word.substring(i+1));
        return res.toString();
        
    }
}