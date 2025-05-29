class Solution {
    public int minimumMoves(String s) {
        int i = 0;
        int res = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                i+=3;
                res++;
            } else i++;
        }
        return res;
    }
}