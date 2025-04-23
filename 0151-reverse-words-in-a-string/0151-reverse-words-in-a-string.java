class Solution {
    public String reverseWords(String s) {
        String result = reverse(s);
        return result;
    }

    private static String reverse(String s){
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}