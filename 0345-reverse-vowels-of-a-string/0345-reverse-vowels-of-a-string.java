class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = sb.charAt(left);
            char rightChar = sb.charAt(right);

            if(vowels.indexOf(leftChar) != -1 && vowels.indexOf(rightChar) != -1){
                sb.setCharAt(left, rightChar);
                sb.setCharAt(right, leftChar);
                left ++;
                right --;
            } else {
                if(vowels.indexOf(leftChar) == -1) left++;
                if(vowels.indexOf(rightChar) == -1) right --;
            }

        }
        return sb.toString();
    }
}