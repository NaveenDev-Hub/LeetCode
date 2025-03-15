class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String rev = new StringBuilder(str).reverse().toString();
        
        if (str.equals(rev))
            return true;
        else
            return false;
    }
}