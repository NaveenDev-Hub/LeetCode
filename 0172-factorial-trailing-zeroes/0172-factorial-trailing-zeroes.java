class Solution {
    public int trailingZeroes(int n) {
        int x = 5;
        int res = 0;
        while (x <= n) {
            res = res + (n / x);
            x = x * 5;
        }
        return res;
        
    }
}